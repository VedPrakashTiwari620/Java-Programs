package com.example.challenges51__76;

import java.util.Scanner;

class ScoreCheck {

    public static void scoreCheck(int marks){
        String sc= marks>80 ? "High" : marks>50&&marks<80 ? "Medium" : "Low";
        System.out.println("Your category is "+sc);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks ");
        int marks = input.nextInt();
        scoreCheck(marks);


    }
}
