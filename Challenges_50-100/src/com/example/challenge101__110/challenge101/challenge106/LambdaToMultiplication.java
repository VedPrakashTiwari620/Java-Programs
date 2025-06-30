package com.example.challenge101__110.challenge101.challenge106;

import java.util.function.BinaryOperator;

public class LambdaToMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a,b) -> a * b;
        int result = multi.apply(2,3);
        System.out.println(result);
    }
}
