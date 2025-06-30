/**
 * Write a program that swaps the two elements in an ArrayList, given their indices.
 */
package com.example.challenge91__100.challange92;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SwapTwoElementInArrayList {

    public static void swap(List numList, int i1, int i2){
        int temp= (int)numList.get(i1);
        numList.set(i1,numList.get(i2));
        numList.set(i2,temp);
    }



    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
//        numList.add(1);

        Collections.addAll(numList,1,2,3,4,5,6,7,8,9,10);

        System.out.println("Collection is : "+ numList);


        swap(numList,0,1);

        System.out.println("Collection is : "+ numList);
    }
}
