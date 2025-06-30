package com.polymorphism;

public class Overloading {





    public Overloading(){
        System.out.println("This is default constructor.");
    }

    public Overloading(String pop){

        System.out.println(pop);
    }


    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c, int d){
        return a+b+b+d;
    }

    public String  add(String a, String b){
        return a+b;
    }

    public double add(int b, int a, int c){
        return a+b;
    }
}
