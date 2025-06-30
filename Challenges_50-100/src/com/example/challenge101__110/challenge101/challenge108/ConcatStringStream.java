package com.example.challenge101__110.challenge101.challenge108;

import java.util.List;

public class ConcatStringStream {
    public static void main(String[] args) {
        List<String> list = List.of("ABCDEFGHIJKLMNOPQRSTUVWXYZ","ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        String concat = list.stream()
                .filter(str -> str.length()>=10)
                .reduce("", (a,b) -> a+" "+b);

        System.out.println(concat);
    }
}
