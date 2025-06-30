package com.example.challenge115;
import java.util.List;
public class StringList {
    public static void main(String[] args) {
        List<String > list = List.of("1","2","3","4","5","6","7","8","9","10");

        System.out.println("Before mapping:"+list);


        list.stream()
                .map(Integer::parseInt)
                .map( num -> Math.pow(num,2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);

//        String s = "1";
//        int a = Integer.parseInt(s);
//        System.out.println(a);

        String s = "abc";
        String s1 = "abc";

        System.out.println(s1.compareToIgnoreCase(s));
        System.out.println(s.toUpperCase().equals(s1));



    }
}
