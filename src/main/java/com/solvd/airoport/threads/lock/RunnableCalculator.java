package com.solvd.airoport.threads.lock;

public class RunnableCalculator implements Runnable{

    private int a;
    private int b;
    private UseLock useLock;

    public RunnableCalculator(int a, int b, UseLock useLock) {
        this.a = a;
        this.b = b;
        this.useLock = useLock;
    }

    @Override
    public void run() {
        int result = a + b;
        useLock.save(result);
    }
}
