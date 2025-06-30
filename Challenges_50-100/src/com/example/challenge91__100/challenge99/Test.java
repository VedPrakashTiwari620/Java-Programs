package com.example.challenge91__100.challenge99;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        PrintHelloThread t1 = new PrintHelloThread(1);
        PrintHelloThread t2 = new PrintHelloThread(2);

        t1.setName("1 Thread");
        t2.setName("2 Thread");
        t1.start();
        t1.join();

        t2.start();
    }
}
