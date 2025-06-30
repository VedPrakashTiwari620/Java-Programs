package in.kgcoding.inhritance.inheritance1;

import in.kgcoding.inhritance.Vehicle;

public class TwoWheeler extends Vehicle {

    public TwoWheeler(){
        setNumberOfTyres(2);
        numberOfTyres=4;
    }

    public void balancing(){
        System.out.println("I'm balancing on two wheeler.");
    }

}
