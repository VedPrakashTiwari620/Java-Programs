package com.example.challenge101__110.challenge101.challenge109;

import java.util.List;

public class PrintOddStreamFilter {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,1,11,1,12,12,13);

        list.stream()
                .filter(a -> a%2 != 0 )
                .forEach(num -> System.out.println(num));
    }
}
