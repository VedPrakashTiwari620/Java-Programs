package com.example.challenge101__110.challenge101.challenge102;

public class SignalThread extends Thread{
    private final TraficColor color;


    public SignalThread(TraficColor color){
        this.color=color;
    }


    @Override
    public void run() {
        System.out.printf("%s active",color);
        try{
            Thread.sleep(color.getOnTimeInMillis());
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception");
        }
        System.out.println("Inactive signal...");
    }
}
