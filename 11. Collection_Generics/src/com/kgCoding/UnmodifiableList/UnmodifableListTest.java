package com.kgCoding.UnmodifiableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifableListTest {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(2);


        System.out.println("List is"+ numList);
        List<Object> unmodifiableList = Collections.unmodifiableList(numList);
        numList.add(12);

        unmodifiableList.add(12);


        List<Integer> unModFiab = Collections.unmodifiableList(numList);

    }
}
