package com.Multithreading.Runnable;

public class PrintTask implements Runnable{
    private final char target;

    public PrintTask(char target){
        this.target=target;
    }

    @Override
    public void run() {
        //Print Tast
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ",i,target);
        }
        System.out.printf("\n%s  Thread Name %c Task Completed.",Thread.currentThread().getName(),target);
    }
}
