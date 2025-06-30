package com.Multithreading.ThreadPriority;

public class TestPriority {
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority('@');

        t1.setPriority(1);

        ThreadPriority t2 = new ThreadPriority('#');

        t2.setPriority(Thread.MAX_PRIORITY);

        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();

    }
}
