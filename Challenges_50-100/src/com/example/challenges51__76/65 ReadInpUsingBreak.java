package com.example.challenges51__76;

import java.util.Scanner;

class ReadInpUsingBreak {

    static void readInput(){
        Scanner input=new Scanner(System.in);
        String inp;

        for (int i = 0; i>=0; i++) {
            System.out.println("Enter the input in string format");
            inp=input.next();

            if (inp.equalsIgnoreCase("exit")){
                break;
            }

        }
        System.out.println("You have successfully exited.");
    }

    public static void main(String[] args) {
        //WAP to read input using break and breK THE LOOP IF A SPECIFIC KEYWORD (LIKE "exit") is entered.

        readInput();

    }
}
