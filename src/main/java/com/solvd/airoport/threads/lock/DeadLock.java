package com.solvd.airoport.threads.lock;

import org.apache.log4j.Logger;

public class DeadLock {
    private static final Logger LOGGER = Logger.getLogger(DeadLock.class);

    public static void main(String[] args) {
        Object process1 = new Object();
        Object process2 = new Object();

        Thread thread1 = new Thread(() ->{
            LOGGER.debug(Thread.currentThread().getName() + " start");
            synchronized (process1){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (process2){

                }
            }
            LOGGER.debug(Thread.currentThread().getName() + " end");
        }, "Thread 1");

        Thread thread2 = new Thread(() ->{
            LOGGER.debug(Thread.currentThread().getName() + " start");
            synchronized (process2){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (process1){

                }
            }
            LOGGER.debug(Thread.currentThread().getName() + " end");
        }, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
