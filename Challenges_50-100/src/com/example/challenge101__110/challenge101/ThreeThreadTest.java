package com.example.challenge101__110.challenge101;

public class ThreeThreadTest extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread Starting..." + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println(getState());
            System.out.println("Running");
            System.out.println("Thread Stop...");
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception ");
        }

    }
}
