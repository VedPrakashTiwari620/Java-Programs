package com.example.challenge101__110.challenge101;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        ThreeThreadTest t1 = new ThreeThreadTest();
        ThreeThreadTest t2 = new ThreeThreadTest();
        ThreeThreadTest t3 = new ThreeThreadTest();


        t1.start();
        t1.join();


        t2.start();
        t2.join();

        t3.start();

    }
}
