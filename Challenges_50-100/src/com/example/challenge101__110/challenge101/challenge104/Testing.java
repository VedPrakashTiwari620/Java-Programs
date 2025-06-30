package com.example.challenge101__110.challenge101.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Testing {
    public static void main(String[] args) throws InterruptedException{
        try (ExecutorService service = Executors.newFixedThreadPool(1)) {

            FixedThreadChall t1 = new FixedThreadChall();
            FixedThreadChall t2 = new FixedThreadChall();
            FixedThreadChall t3 = new FixedThreadChall();
            FixedThreadChall t4 = new FixedThreadChall();

            service.submit(t1);
            service.submit(t2);
            service.submit(t3);
            service.submit(t4);
            service.submit(t1);
            service.submit(t2);
            service.submit(t3);
            service.submit(t4);
            service.submit(t1);
            service.submit(t2);
            service.submit(t3);
            service.submit(t4);
            service.submit(t1);
            service.submit(t2);
            service.submit(t3);
            service.submit(t4);
            service.submit(t1);
            service.submit(t2);
            service.submit(t3);
            service.submit(t4);
            service.submit(t1);
            service.submit(t2);
            service.submit(t3);
            service.submit(t4);


            service.shutdown();

            if (!service.awaitTermination(3, TimeUnit.SECONDS)){
                System.out.println("Emergency Shutdown!");
                service.shutdown();
            }
        }
    }

}
