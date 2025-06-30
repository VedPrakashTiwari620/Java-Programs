package in.kgcoding.inhritance;

import in.kgcoding.inhritance.inheritance1.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.toString());
        System.out.println(vehicle.getClass());


        TwoWheeler two = new TwoWheeler();
//        two.numberOfTyres=2;
        two.commute();
        two.balancing();


        MotorCycle mot = new MotorCycle();
        System.out.println();
        mot.commute();
        mot.petrolCapacity();
        mot.start();
        System.out.println();
//        mot.setNumberOfTyres(2);


        Cycle cyc = new Cycle();
        cyc.commute();
    }
}
