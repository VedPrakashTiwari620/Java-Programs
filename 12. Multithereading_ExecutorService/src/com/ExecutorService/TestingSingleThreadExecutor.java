package com.ExecutorService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        SingleThread task1 = new SingleThread('@');
        SingleThread task2 = new SingleThread('#');
        SingleThread task3 = new SingleThread('*');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.shutdown();


        ExecutorService service1 = Executors.newSingleThreadExecutor();
        service1.submit(task3);
        service1.shutdown();

    }
}
