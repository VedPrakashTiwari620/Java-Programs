/**
 * Write a program that takes a String and returns the number of unique characters using a set.
 */
package com.example.challenge91__100.challange95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();
        System.out.println("Pls enter your String");
        String userStr = input.next();

        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }

        System.out.println("Unique Character in String :"+unique);


        for (char c : userStr.toCharArray()) {
            System.out.print(c+" ");
        }


    }
}
