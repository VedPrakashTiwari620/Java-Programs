package com.kgCoding.CollectionList;

import java.util.ArrayList;

public class CollectionList {
    public static void main(String[] args) {
//        ArrayList strList = new ArrayList();
        ArrayList<String> strList = new ArrayList<>();

        strList.add("Ved");
//        strList.add("Prakash");
//        strList.add(100);//Error Because the strList is String type
        strList.add(1, "Prakash");
        System.out.println(strList.get(0));
        System.out.println(strList.get(1));
//        System.out.println(strList.get(2));


        for (Object o : strList) {
            System.out.print(o);
        }

        System.out.println();

        strList.remove(1);
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }


        if (strList.contains("Ved")){
            System.out.println("Yes Ved Exists at."+strList.indexOf("Ved"));
        }




    }
}
