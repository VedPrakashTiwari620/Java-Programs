package com.example.challenges51__76;

import java.util.Scanner;

class PrimeOrNotUsingFor {


    static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        } else {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int num= input.nextInt();
        boolean numIs=isPrime(num);


        System.out.println("Your number is "+ (numIs ? "Prime":"Not Prime"));
//        if (numIs){
//            System.out.println("Number is Prime");
//        }else {
//            System.out.println("Number is not prime");
//        }


    }
}
