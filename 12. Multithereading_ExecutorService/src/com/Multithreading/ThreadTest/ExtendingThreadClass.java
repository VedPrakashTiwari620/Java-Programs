package com.Multithreading.ThreadTest;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        ThirdThread t3 = new ThirdThread();

        System.out.println("Starting First Thread");
        t1.start();
        System.out.println("Starting Second Thread");
        t2.start();
        System.out.println("Starting Third Thread");
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d",Thread.currentThread().getName(), (endTime-startTime));




    }
}
