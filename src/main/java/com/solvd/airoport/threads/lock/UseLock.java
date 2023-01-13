package com.solvd.airoport.threads.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UseLock {

    private static List<Integer> resultSet;
    private int finished;

    private Lock lock;
    private Condition condition;

    public static void main(String[] args) {
        new UseLock().run();
    }

    private void run() {
        int nThread = 5;
        finished = 0;
        resultSet = new ArrayList<>();
        for (int i = 0; i < nThread; i++) {
            RunnableCalculator runnableCalculator = new RunnableCalculator(5, 10, this);
            new Thread(runnableCalculator).start();
        }
        lock = new ReentrantLock();
        condition = lock.newCondition();

        try {
            lock.lock();
            while (finished < nThread) {
                condition.await();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        System.out.println("total " + finished);
        System.out.println("result " + resultSet);
    }

    public void save(int result) {
        try {
            lock.lock();
            resultSet.add(result);
            finished++;
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}


