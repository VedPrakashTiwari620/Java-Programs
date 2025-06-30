package com.example.challenges51__76;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num to check Even or Odd");
        int num= input.nextInt();

        String numIs= num%2==0?"Even":"Odd";

        System.out.println("The given num is "+ numIs);
    }
}
