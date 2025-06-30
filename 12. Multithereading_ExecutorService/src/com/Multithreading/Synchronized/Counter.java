package com.Multithreading.Synchronized;

public class Counter {
    private int count=0;

//    //Synchronized method to increment the counter
//    public void increment(){
//        count++;
//    }
    //Synchronized method to increment the counter
    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

