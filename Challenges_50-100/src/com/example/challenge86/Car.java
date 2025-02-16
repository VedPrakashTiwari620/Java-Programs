package com.example.challenge86;

public class Car extends Vehicle{


    @Override
    public void service(){
        super.service();
        System.out.println("Service of car");
    }
}
