package com.example.challenge111;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TestingFactorialFunctional {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int number = input.nextInt();

        FactUsingFunctionalProg fact = num -> {
            OptionalInt fact1 = IntStream.rangeClosed(2,num)
                    .reduce((a,b)-> a*b);

            if(fact1.isPresent()){
                return fact1.getAsInt();
            }
            return -1;

        };

        System.out.println(fact.factorial(number));

        OptionalInt fact1 = IntStream.rangeClosed(2,number)
                .reduce((a,b)-> a*b);

        System.out.println(fact1.getAsInt());


    }
}
