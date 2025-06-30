package com.example.challenges77__90.challenge83;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea(){
        System.out.println("Welcome to calculate Area of Circle");
        System.out.println("Area of Circle: "+Math.PI*(Math.pow(radius,2)));
    }

}
