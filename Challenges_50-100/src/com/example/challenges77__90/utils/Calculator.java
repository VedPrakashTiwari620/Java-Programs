package com.example.challenges77__90.utils;

import com.example.challenges77__90.challenge77.Circle;
import com.example.challenges77__90.challenge77.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(7.0);
        Rectangle rec = new Rectangle(10,10);


        double cirArea= Math.PI* Math.pow(cir.radius, 2);

        double recArea= rec.breadth*rec.length;

        System.out.printf("Area of Circle is %.2f & Area of Rectangle %.2f", cirArea, recArea);

    }
}
