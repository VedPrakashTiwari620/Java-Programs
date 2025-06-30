package com.Multithreading.Synchronized;

public class Test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Counter counter = new Counter();
        SynchronizedKeyword t1 = new SynchronizedKeyword(counter);
        SynchronizedKeyword t2 = new SynchronizedKeyword(counter);



        try {
            t1.start();

            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupt Exception "+e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value %d and time taken %d",counter.getCount(),(endTime-startTime));
    }
}
