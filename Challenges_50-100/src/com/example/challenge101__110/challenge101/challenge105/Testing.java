package com.example.challenge101__110.challenge101.challenge105;

import java.util.concurrent.*;

public class Testing {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(3)){
            for (int i = 1; i <= 16; i++) {
                CallableTask ti = new CallableTask(i);
                Future<Integer> res = service.submit(ti);
                System.out.printf("Result of %d is : %d \n",i,res.get());
            }

            service.shutdown();

            if (! service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Bahut ho gya bas kar.");
                service.shutdown();
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
