package in.kgcoding;

import java.util.StringJoiner;

public class Car {
    public String colour;
    public String model;
    private double fuelLevel;
    long costOfPurchase;

    public Car(){

    }

    public Car(String colour, long costOfPurchase, double fuelLevel, String model) {
        this.colour = colour;
        this.costOfPurchase = costOfPurchase;
        this.fuelLevel = fuelLevel;
        this.model = model;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("colour='" + colour + "'")
                .add("model='" + model + "'")
                .add("fuelLevel=" + fuelLevel)
                .add("costOfPurchase=" + costOfPurchase)
                .toString();
    }
}
