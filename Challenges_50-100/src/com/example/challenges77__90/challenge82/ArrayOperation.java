package com.example.challenges77__90.challenge82;

import java.util.Arrays;

public class ArrayOperation {


    private int arr[];

    public ArrayOperation(int[] arr) {
        this.arr = arr;
    }

    public class Statistics{

        double mean(){
            double sum=0;
            for (int i : arr) {
                sum+=i;
            }
            return sum/arr.length;
        }

        int  median(){
            Arrays.sort(arr);

            return arr[arr.length/2];
        }
    }


}
