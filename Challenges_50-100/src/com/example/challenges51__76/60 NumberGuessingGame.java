package com.example.challenges51__76;

import java.util.Scanner;

class NumberGuessingGame {

    static int guessNo(){
        System.out.println("Hey Computer enter your number which will be guess");
        Scanner input =new Scanner(System.in);
        int guessNo= input.nextInt();
        return guessNo;

    }

    static void guessing(){
        int guess=guessNo();
        Scanner input = new Scanner(System.in);

        System.out.println("Guessing Game Started");
        int userNo;
        do {
            System.out.println("Hey User enter the no pls:");
            userNo=input.nextInt();

        }while (!(userNo==guess));


        System.out.println("You have enter correct password.");
    }

    public static void main(String[] args) {

        guessing();
    }
}
