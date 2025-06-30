package in.gettersetter;

import java.awt.*;

public class Car {
    private String colour;  // public

    private String model; // public

    private double fuelLevel;
    private long costOfPurchase; // default


    public Car(String colour, long costOfPurchase, double fuelLevel, String model) {
        this.colour = colour;
        this.costOfPurchase = costOfPurchase;
        this.fuelLevel = fuelLevel;
        this.model = model;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour){
        if (colour.equals("Yellow")){
            System.out.println("Pagal hai kya");
        }else {
            this.colour=colour;
        }
    }

    public String getModel(){
        return model;
    }

}
