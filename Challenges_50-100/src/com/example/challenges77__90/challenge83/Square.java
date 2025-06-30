package com.example.challenges77__90.challenge83;

public class Square extends Shape {
    private final int side;

    public Square(int side){
        this.side=side;
    }
    @Override
    public void calculateArea(){
        System.out.println("Welcome to Calculate Area of Square");
        System.out.println("Area of Square is :"+Math.pow(side,2));
    }
}
