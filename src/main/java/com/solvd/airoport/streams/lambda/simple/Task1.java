package com.solvd.airoport.streams.lambda.simple;

import org.apache.log4j.Logger;

import java.util.function.Predicate;

public class Task1 {

    private static final Logger LOGGER = Logger.getLogger(Task1.class);

    public static void main(String[] args) {
        Operationable operation;
        operation = (x,y)->x+y;

        int result = operation.calculate(10, 20);
        LOGGER.info(" first operation result = " + result);


        SecondOperationable<Integer> operation1 = (x, y)-> x + y;
        SecondOperationable<String> operation2 = (x, y) -> x + y;

        LOGGER.info(" first SecondOperationable operation result = " + operation1.calculate(20, 10));//30
        LOGGER.info(" second SecondOperationable operation result = " + operation2.calculate("20", "10"));//2010

        Operationable operation3 = (x,y)->x*y;

        whenEqual(1, 2, operation);
        whenEqual(1, 2, operation3);
        whenEqual(1, 2, (int a, int b) -> a/b);
        whenEqual(10, 5, Task1::division);


        Predicate<Integer> isPositive = x -> x>0;
        boolean a = isPositive.test(0);
        LOGGER.info("Functional interface Predicate : " + result);



        Runnable r = ()->{
            LOGGER.info("new thread with lambda " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                LOGGER.error("Thread has been interrupted");
            }
        };

        Thread myThread = new Thread(r, "myThread");

    }

    private static int whenEqual(int a,int b, Operationable func){
        if (a == b)
            return func.calculate(a, b);
        return 0;
    }

    public static int division(int a, int b){
        return a / b;
    }

}

interface Operationable{
    int calculate(int x, int y);
}

interface SecondOperationable<T>{
    T calculate(T x, T y);
}
