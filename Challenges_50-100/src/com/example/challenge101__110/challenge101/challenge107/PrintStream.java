package com.example.challenge101__110.challenge101.challenge107;

import java.util.ArrayList;
import java.util.List;

public class PrintStream {
    public static void main(String[] args) {
//        String arr[] = new String[]{"Aman","Abhishek","Abhay","Deepak"};

        List<String> list = List.of("Aman","Abhishek","Abhay","Deepak");
        list.stream()
                .forEach(s -> System.out.println(s));
    }
}
