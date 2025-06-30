package com.ExecutorService;

public class SingleThread implements Runnable{
    @Override
    public void run() {
        //Print Task
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d%c ",i, target);
        }
        System.out.printf("\n %s %c Task Complete",Thread.currentThread().getName(),target);
    }

    private final char target;

    public SingleThread(char target){
        this.target= target;
    }


}
