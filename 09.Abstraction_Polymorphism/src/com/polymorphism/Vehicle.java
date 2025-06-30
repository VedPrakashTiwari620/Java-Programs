package com.polymorphism;

public abstract class Vehicle {

    private final int noOfTyres;


    int fuel;

    Vehicle(){
        this.noOfTyres=0;
    }

    Vehicle(int noOfTyres){
        this.noOfTyres=noOfTyres;
    }

    public int getNoOfTyres(){
        return noOfTyres;
    }

    public  void start(){
        System.out.println("Vehicle is starting....");
    }

    public  void sound(){
        System.out.println("Boommmmmmm...");
    }
}
