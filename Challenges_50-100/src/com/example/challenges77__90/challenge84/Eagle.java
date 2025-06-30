package com.example.challenges77__90.challenge84;

public class Eagle extends Bird{


    public Eagle(){
        super("breed");
    }


    // It can take breed when the Eagle Object is created

//    public Eagle(String breed){
//        super(breed);
//    }


    @Override
    public void fly(){
        System.out.println("I can also fly in the sky....");
    }
}
