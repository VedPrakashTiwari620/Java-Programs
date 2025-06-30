package com.Multithreading.ThreadTest;

public class ThirdThread extends Thread{
    @Override
    public void run() {
        //Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println();
        System.out.printf("%s # Third task complete \n",Thread.currentThread().getName());
    }
}
