package com.Multithreading.ThreadTest;

public class FirstThread extends Thread{
    @Override
    public void run() {
        //First Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println();
        System.out.printf("%s * First task complete \n", Thread.currentThread().getName());

    }
}
