package com.passBy;

public class TestPassBy {


    public static int add(int a, int b){
        a+=b;
        return a;
    }

    public static void main(String[] args) {


        int x=12;
        int y=10;
        int sum= add(x,y);

        System.out.println(x);
        System.out.println(y);

    }
}
