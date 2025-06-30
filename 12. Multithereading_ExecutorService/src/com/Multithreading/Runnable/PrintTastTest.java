package com.Multithreading.Runnable;

public class PrintTastTest {
    public static void main(String[] args) {
        PrintTask p1 = new PrintTask('$');

        PrintTask p2 = new PrintTask('*');

        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.start();
        t2.start();
        t3.start();

    }
}
