package com.example.challenge101__110.challenge101.challenge103;

public class SingleThread implements Runnable{
    @Override
    public void run() {
        //Task
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
