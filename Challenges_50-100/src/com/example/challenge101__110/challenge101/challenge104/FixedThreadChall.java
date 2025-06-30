package com.example.challenge101__110.challenge101.challenge104;

import javax.swing.plaf.TableHeaderUI;

public class FixedThreadChall implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Thread Name: "+thread.getName());
        try {
            Thread.sleep(getRandom());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End Thread "+thread.getName());
    }

    private int getRandom(){
        double random = Math.random() * 5 + 1;
        return (int) Math.floor(random);
    }

}
