package com.example.challenge112;

import java.util.Optional;
import java.util.Scanner;

public class OptionalString {

    static Optional<String> string(String name){

        if(name.isEmpty()){
            Optional<String> str = Optional.empty();
            return str;
        }

        Optional<String> str1 = Optional.of(name.toUpperCase());
        return str1;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your name :");
        String name = input.next();

        System.out.println(string(name).get());


    }
}

