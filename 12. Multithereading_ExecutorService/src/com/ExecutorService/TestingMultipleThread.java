package com.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultipleThread {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        MultipleThreadExecutor task1 = new MultipleThreadExecutor('*');
        MultipleThreadExecutor task2 = new MultipleThreadExecutor('#');
        MultipleThreadExecutor task3 = new MultipleThreadExecutor('@');
        MultipleThreadExecutor task4 = new MultipleThreadExecutor('$');
        MultipleThreadExecutor task5 = new MultipleThreadExecutor('&');
        MultipleThreadExecutor task6 = new MultipleThreadExecutor('!');
        MultipleThreadExecutor task7 = new MultipleThreadExecutor('%');


//        service.submit(task1);
//        service.submit(task2);
//        service.submit(task3);
//        service.submit(task4);
//        service.submit(task5);
//        service.submit(task6);
//        service.submit(task7);


        for (int i = 0; i < 10; i++) {
            MultipleThreadExecutor task = new MultipleThreadExecutor((char)i);
            service.submit(task);
        }


//        service.shutdown();
        System.out.println("**************");
        if(!service.awaitTermination(2, TimeUnit.SECONDS)){
            System.out.println("**********");
            service.shutdown();
        }


    }
}
