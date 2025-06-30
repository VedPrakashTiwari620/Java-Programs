package com.example.challenge91__100.challenge100;

public class ThreadStateCha implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(4000);

            System.out.printf("From inside Thread %s \n",Thread.currentThread().getState());
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
