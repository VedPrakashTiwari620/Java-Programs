package com.Multithreading.ThreadTest;

public class SecondThread extends Thread{
    @Override
    public void run() {
        //Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println();
        System.out.printf("%s $ Second task complete \n",Thread.currentThread().getName());

    }
}
