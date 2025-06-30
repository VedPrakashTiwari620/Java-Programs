package com.example.challenge101__110.challenge101.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Write a program that creates a single-threaded executor service. Define and submit a simple Runnable
 * task that print numbers from 1 to 10.
 * After submissions, shut down the executor.
 */
public class SingleThreadTesting {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        SingleThread task1 = new SingleThread();

        service.submit(task1);

        service.shutdown();
    }
}
