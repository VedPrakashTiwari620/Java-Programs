/**
*Use the Collections class to count the frequency of a particular element in an ArrayList.
 **/
package com.example.challenge91__100.challange91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge91 {
    public static void main(String[] args) {


        List<Integer> numList = Arrays.asList(1,2, 3 ,4, 1, 1 , 3 , 3 ,4, 5, 5 ,3);

        int freq = Collections.frequency(numList,1);
        System.out.printf("The frequency of 1 is %d",freq);


    }

}
