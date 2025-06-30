package com.example.challenge101__110.challenge101.challenge110;

import java.util.List;

public class Testing {
    public static void main(String[] args) {

        Candidate candidate = num -> {
            for (int i = 2; i < num/2; i++) {
                if (num%i==0){
                    return false;
                }
            }
            return true;
        };


        List<Integer> list = List.of(1,2,3,4,5,6,7,8);


        System.out.println(candidate.isCandidate(1));


    }
}
