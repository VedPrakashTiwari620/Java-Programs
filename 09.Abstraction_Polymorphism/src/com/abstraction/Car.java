package com.abstraction;

public final class Car extends Vehicle{
   private int noOfDoors;


    public Car(){
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Brooommmm....");
    }

    @Override
    public void getSetGo() {
        System.out.println("Ready to Go....");
    }
    @Override
    public void com(){
        System.out.println("Many System of Transportation");
    }

    

//    Cannot be override because this startt method is final declare
//    @Override
//    public void startt(){
//
//    }


}
