package com.Multithreading.ThreadCommunication;

public class ThreadCommunicationTest {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Before Sleeping");
        Thread.sleep(100000);

        Thread.sleep(12,23);
        System.out.println("After sleeping");
    }
}
