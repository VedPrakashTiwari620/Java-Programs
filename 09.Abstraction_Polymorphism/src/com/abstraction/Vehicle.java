package com.abstraction;

public abstract class Vehicle implements Transport{

    private int noOfTyres;

    public abstract void makeStartSound();

    @Override
    public void getSetGo(){
        System.out.println("Going to place....");
    }

    public Vehicle(int noOfTyres){
        this.noOfTyres=noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("Going....");
    }


    public final void startt(){
        System.out.println("Started");
    }

}
