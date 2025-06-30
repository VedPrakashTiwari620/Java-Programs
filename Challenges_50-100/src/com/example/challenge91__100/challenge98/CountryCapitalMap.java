package com.example.challenge91__100.challenge98;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapitalMap {
    public static void main(String[] args) {


        HashMap<String, String> country = new HashMap<>();
        country.put("India","New Delhi");
        country.put("Pakistan","Afghanistan");
        country.put("USA","Washington DC");
        country.put("Nepal","Kathmandu");

        System.out.println("Enter the country name to get the capital: ");
        Scanner input = new Scanner(System.in);
        String cName = input.next();


        if (country.containsKey(cName)){
            System.out.println(country.get(cName));
        }else {
            System.out.println("Not Exists.");
        }


    }
}
