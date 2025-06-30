package com.ExecutorService;

import javax.management.relation.RoleInfoNotFoundException;

public class MultipleThreadExecutor implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=50;i++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ",i,target);
        }
        System.out.printf("\n %s %c Task Complete. ",Thread.currentThread().getName(),target);
    }

    private final char target;

    public MultipleThreadExecutor(char target){
        this.target=target;
    }
}
