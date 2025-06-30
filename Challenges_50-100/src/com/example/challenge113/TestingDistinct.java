package com.example.challenge113;

import java.util.Arrays;
import java.util.List;

public class TestingDistinct {
    public static void main(String[] args) {
        //Given an array of integers, create a stream, use the distinct operation to remove duplicates, and
        //collect the result into a new list.

        List<Integer> arr = Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,8,9,10,10);

        List<Integer> arrDistinct =
                arr.stream()
                        .distinct()
                        .toList();

        System.out.println(arr);
        System.out.println(arrDistinct);
    }
}
