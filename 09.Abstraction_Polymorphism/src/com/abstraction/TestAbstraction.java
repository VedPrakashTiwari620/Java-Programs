package com.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {


//        Vehicle vehicle=new Vehicle(); Object cannot create because it is abstract class

        Car car =new Car();

        car.commute();
        car.makeStartSound();




    }
}
