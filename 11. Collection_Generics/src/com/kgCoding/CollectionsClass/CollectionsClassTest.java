package com.kgCoding.CollectionsClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsClassTest {

    public static <E> void print(Collection<E> collection){
        System.out.print("Collection is: ");
        for (E e : collection) {
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>  numList = new ArrayList<>();

        numList.add(11);
        numList.add(2);
        numList.add(33);
        numList.add(14);
        numList.add(25);

        print(numList);
        Collections.sort(numList);
        print(numList);
        Collections.reverse(numList);
        print(numList);
    }
}
