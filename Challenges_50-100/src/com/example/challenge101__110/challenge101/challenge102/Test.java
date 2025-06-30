package com.example.challenge101__110.challenge101.challenge102;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        SignalThread t1 = new SignalThread(TraficColor.RED);
        SignalThread t2 = new SignalThread(TraficColor.GREEN);
        SignalThread t3 = new SignalThread(TraficColor.YELLOW);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
