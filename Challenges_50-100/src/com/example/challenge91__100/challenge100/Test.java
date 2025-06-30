package com.example.challenge91__100.challenge100;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        ThreadStateCha t1 = new ThreadStateCha();
        ThreadStateCha t2 = new ThreadStateCha();
        System.out.println(new Thread(t1).getState());
        new Thread(t1).start();
        long startTime = System.currentTimeMillis();
        new Thread(t1).join();

        System.out.println(new Thread(t1).getState());
        new Thread(t2).start();
        long endTime = System.currentTimeMillis();

        System.out.println(endTime-startTime);
    }
}
