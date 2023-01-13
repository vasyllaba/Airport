package com.solvd.airoport.threads;

import org.apache.log4j.Logger;

public class Task1 {

    private static final Logger LOGGER = Logger.getLogger(Task1.class);

    public static void main(String[] args) {
        //call thread with interface
        Thread myThread = new Thread(new Example1(), "MyThread");
        myThread.start();


        //call thread with inheritance
        new Example2().start();

    }
}

class Example1 implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(Example1.class);
    @Override
    public void run() {
        LOGGER.debug("run Example with implementation runnable");
    }
}

class Example2 extends Thread {
    private static final Logger LOGGER = Logger.getLogger(Example2.class);
    @Override
    public void run() {
        LOGGER.debug("run Example with extending Thread");
    }
}
