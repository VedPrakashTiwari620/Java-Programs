package com.example.challenges51__76;

import java.util.Scanner;

class FibonacciUsingRecursion {

    static void printFibonacci(int n){
        int first=0;
        int second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");

        for (int i=3;i<=n;i++){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;

        }
    }

    static int fibonacci(int positiom){
        if (positiom==1){
            return 0;
        }
        if (positiom==2){
            return 1;
        }
        return fibonacci(positiom-1)+fibonacci(positiom-2);
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to print fibonacci series ");
//        printFibonacci(1251515610);



        System.out.println("Enter the number of element to be printed");
        int count=input.nextInt();
        for (int i=1;i<=count;i++){
            System.out.print(fibonacci(i)+" ");
        }

    }
}