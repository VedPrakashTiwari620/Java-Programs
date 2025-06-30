package com.example.challenge91__100.challenge99;

public class PrintHelloThread extends Thread{
    private final int number;

    public PrintHelloThread(int number){
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {

            System.out.printf("Hello from Thread %d \n",number);
        }
    }
}
