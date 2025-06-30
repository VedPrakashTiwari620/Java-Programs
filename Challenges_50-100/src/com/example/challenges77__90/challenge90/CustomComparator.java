package com.example.challenges77__90.challenge90;

import java.util.*;

public class CustomComparator {

    public static void sortInDecending(List stringList){
//        Collections.reverse(stringList);

        Collections.sort(stringList, new Comparator<String>() {


            @Override
            public int compare(String s, String  t1){
                if (s.equals(t1)){
                    return 0;
                } else if ((s.charAt(0) < t1.charAt(0))) {
                    return -1;
                }else{
                    return 1;
                }
            }


        });



//        Collections.sort(stringList, new Comparator<String>() {
//
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.charAt(0) == o1.charAt(0)){
//                    return 0;
//                } else if (o1.charAt(0)< o2.charAt(0)) {
//                    return -1;
//                }else {
//                    return 1;
//                }
//            }
//        });
    }

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();

        List<String> strList = Arrays.asList("Aakash","Bikash","Chowel","Dinesh","Embresh");

        System.out.println("List is: "+strList);

        sortInDecending(strList);

        System.out.println("List is: "+strList);
    }
}
