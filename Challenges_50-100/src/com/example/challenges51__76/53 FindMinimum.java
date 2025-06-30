package com.example.challenges51__76;

import java.util.Scanner;

class FindMinimum {
    public static void main(String[] args) {
        //Create a program to find the minimum of two numbers.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first numbers");
        int a=input.nextInt();
        System.out.println("Enter the second numbers");
        int b=input.nextInt();

        int min=a<b?a:b;
        System.out.println("The minimum is "+min);

    }
}
