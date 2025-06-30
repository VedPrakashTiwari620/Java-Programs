package in.FunctionalPrograming.FilterAndReduce;

import java.util.ArrayList;
import java.util.Collections;

public class TestingFilter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        Collections.addAll(list,"Banana","Mango","Cherry","Date");
        System.out.println(list.size());

        System.out.println("Printing list normally:");
        for (String fruits : list) {
            System.out.print(fruits+" ");
        }
        System.out.println();


        System.out.println("Printing list using Stream");
//        list.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        list.stream().forEach(fruit -> System.out.println(fruit));
        System.out.println("Printing list using filter");
        list.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));


    }
}
