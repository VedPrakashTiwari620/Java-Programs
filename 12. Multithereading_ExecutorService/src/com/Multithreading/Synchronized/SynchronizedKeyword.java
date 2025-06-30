package com.Multithreading.Synchronized;

import com.Multithreading.ThreadCommunication.ThreadCommunicationTest;

public class SynchronizedKeyword extends Thread {
    private final Counter counter;

    public SynchronizedKeyword(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
