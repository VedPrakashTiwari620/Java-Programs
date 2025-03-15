package com.Multithreading.ThreadTest;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //First Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println();
        System.out.println(" * First task complete");


        //Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println();
        System.out.println(" $ Second task complete");

        //Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println();
        System.out.println(" # Third task complete");
        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken by the program :"+(endTime-startTime));
    }
} 