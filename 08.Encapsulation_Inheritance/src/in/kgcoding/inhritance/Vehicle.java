package in.kgcoding.inhritance;

public class Vehicle {
    protected int numberOfTyres;

    public void setNumberOfTyres(int noOfTyres){
        this.numberOfTyres=noOfTyres;
    }
    public void commute(){
        System.out.printf("I'm going from place A to place B using %d tyres.",numberOfTyres);
    }
}
