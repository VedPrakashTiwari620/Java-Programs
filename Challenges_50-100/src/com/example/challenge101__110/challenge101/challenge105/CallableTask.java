package com.example.challenge101__110.challenge101.challenge105;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

    private final int num;

    @Override
    public Integer call() throws Exception {
        System.out.println("Calculating Factorial of : "+ num);
        Thread.sleep(getRandom()*500);
    return getFactor(num);
    }

    public CallableTask(int num){
        this.num=num;
    }

    public int getFactor(int num){
        if (num==1){
            return 1;
        }
        return num * getFactor(num-1);
    }


    public int getRandom(){
        return (int) Math.floor(Math.random()*10 +1);
    }
}
