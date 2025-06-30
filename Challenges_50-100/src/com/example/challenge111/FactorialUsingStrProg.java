package com.example.challenge111;

import java.util.Scanner;

public class FactorialUsingStrProg {

    static int fact(int num){
        if (num==1) return 1;
        return num*fact(num-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int num = input.nextInt();

        System.out.println(fact(num));
    }
}
