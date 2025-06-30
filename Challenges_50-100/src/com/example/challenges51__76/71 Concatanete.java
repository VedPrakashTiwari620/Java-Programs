package com.example.challenges51__76;

import java.util.Scanner;

class Concatanete {
    public static void main(String[] args) {
        // Concatenate and Convert: Take two strings, concatenate them, and convert the result to upparcase.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName=input.next();
        System.out.println("Enter your second name:");
        String secName=input.next();

//        String name=firstName+secName;
        String name= firstName.concat(" "+secName);
        System.out.println(name.toUpperCase());

    }
}
