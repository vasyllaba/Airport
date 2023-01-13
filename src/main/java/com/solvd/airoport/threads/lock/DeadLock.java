package com.solvd.airoport.threads.lock;

public class DeadLock {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName() + " start");
            synchronized (lock1){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (lock2){

                }
            }
            System.out.println(Thread.currentThread().getName() + " end");
        }, "Thread 1");

        Thread thread2 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName() + " start");
            synchronized (lock2){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (lock1){

                }
            }
            System.out.println(Thread.currentThread().getName() + " end");
        }, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
