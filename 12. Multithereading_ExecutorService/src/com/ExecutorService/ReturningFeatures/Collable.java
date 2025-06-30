package com.ExecutorService.ReturningFeatures;

public class Collable implements java.util.concurrent.Callable<String> {

    private final String name;

    @Override
    public String call() throws Exception {
       Thread.sleep(4000);

        return name+"Bartiya";
    }

    public Collable(String name) {
        this.name = name;
    }
}
