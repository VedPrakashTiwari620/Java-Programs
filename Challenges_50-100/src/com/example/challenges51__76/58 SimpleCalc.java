package com.example.challenges51__76;

import java.util.Scanner;

class SimpleCalc {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the Arithmetic Symbol to perform [+,-,*,/]");
        char c = input.next().charAt(0);

        System.out.println("Enter the two number ");
        int a=input.nextInt();
        int b=input.nextInt();



        float ans = switch (c){
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            case '/' -> a/b;

            default -> -1;
        };
        System.out.println("The result is "+ans);




    }
}
