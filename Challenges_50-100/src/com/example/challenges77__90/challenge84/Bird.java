package com.example.challenges77__90.challenge84;

public abstract class Bird implements Flyable {

    private final String breed;

    public Bird(String breed){
        this.breed=breed;
    }

    public String getBreed(){
        return breed;
    }


//    @Override
//    public void fly(){
//        System.out.println("We can Fly...");
//    }


}
