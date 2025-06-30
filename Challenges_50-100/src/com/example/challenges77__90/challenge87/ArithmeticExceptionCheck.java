package com.example.challenges77__90.challenge87;

import java.util.Scanner;

public class ArithmeticExceptionCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter the two number to divide.");
            int first=input.nextInt();
            int second=input.nextInt();
            int result=first/second;
            System.out.println("The result is :"+result);
        }catch (ArithmeticException e){
            if (e.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero occurred");
            }else {
                throw e;
            }
        }
    }
}
