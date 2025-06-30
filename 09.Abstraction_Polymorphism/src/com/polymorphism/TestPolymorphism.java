package com.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Car car= new Car();
//        Vehicle vehicle = new Vehicle();
        Plane plane = new Plane();




        car.start();
        plane.start();
//        castTest(vehicle);
//        castTest(car);
//        castTest(plane);



//        Vehicle vCar=new Car();

//        Car cVehicle = (Car) new Vehicle();
//
//
//        Vehicle vehicle1 = new Car();
//        Car car1= new Vehicle(); Compile time errors
//
//
//        Object object = new Car();
//        Object object1 = new Vehicle();
//        Vehicle vehicle2 = new Car();


    }



    public static void castTest(Vehicle veh){
//        Car cVehicle = (Car) veh;
//        veh.noOfDoors();
        veh.start();
//        veh.start();
    }
}
