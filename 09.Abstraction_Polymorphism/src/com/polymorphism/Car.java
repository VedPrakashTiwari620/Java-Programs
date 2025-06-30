package com.polymorphism;

class Car extends Vehicle{

    Car(){
        super(5);
    }


    public int noOfDoors(){
        return 5;
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTyres());

        super.fuel=10;
        System.out.println("Car is Starting...");
    }
}
