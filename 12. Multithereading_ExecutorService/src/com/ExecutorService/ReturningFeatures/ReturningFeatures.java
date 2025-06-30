package com.ExecutorService.ReturningFeatures;

import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReturningFeatures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        Collable t1 = new Collable("Prakash");
        Collable t2 = new Collable("Tiwari");
        Collable t3 = new Collable("Ved");

        Future<String> name = service.submit(t1);
        Future<String> name1 = service.submit(t2);
        Future<String> name2 = service.submit(t3);

        System.out.println("Full name is : "+name.get());
        System.out.println(name1);
        System.out.println(name2);

        service.shutdown();

    }
}
