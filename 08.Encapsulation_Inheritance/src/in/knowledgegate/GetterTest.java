package in.knowledgegate;


import in.gettersetter.Car;

import java.util.Scanner;


public class GetterTest {
    Car car = new Car("Red", 1200000, 12.5, "Maruti");

    public static void main(String[] args) {
        Car car = new Car("Red", 1200000, 12.5, "Maruti");


        car.setColour("Black");
        Scanner input = new Scanner(System.in);
        System.out.printf("%s %s %s",car.getColour(), car.getModel(), car.getColour());

    }
}
