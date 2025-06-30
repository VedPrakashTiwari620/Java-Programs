package com.kgCoding.CollectionSet;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionSetTest {


    public static <E> void print(Collection<E> collection){
        System.out.print("Collection is: ");
        for (E o : collection) {
            System.out.print(o+" ");
        }
    }
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();

        str.add("Apple");
        str.add("Banana");
        str.add("Cow");
        str.add("Dog");




        boolean isAdded= str.add("Apple");


        System.out.println("Is add element possible: ");


        print(str);
    }
}
