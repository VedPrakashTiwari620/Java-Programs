package com.kgCoding.HashMap;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.HashMap<>();

        map.put("Apple",10);
        map.put("Banana",20);
        map.put("Cat",20);

        Integer a = map.get("Apple");

        System.out.println(map.keySet());
        System.out.println(map.remove("Apple"));
        System.out.println(a);

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println(map.containsKey("Cat"));


        for (String key : map.keySet()) {
            System.out.printf("%s : %s \n",key, map.get(key));
        }

    }
}
