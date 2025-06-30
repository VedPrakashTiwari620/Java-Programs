package com.Multithreading.ThreadPriority;

public class ThreadPriority extends Thread{
    @Override
    public void run() {
        //Task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d%c ",i,target);
        }
        System.out.printf("\n %s %c Task Completed.",Thread.currentThread(),target);
    }

    private final char target;

    public ThreadPriority(char target){
        this.target=target;
    }
}
