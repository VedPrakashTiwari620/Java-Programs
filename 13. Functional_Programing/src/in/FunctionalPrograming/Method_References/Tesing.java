package in.FunctionalPrograming.Method_References;

import java.util.List;
import java.util.Optional;

public class Tesing {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,12,42,2,4,56,767,2);

//        list.forEach(f -> System.out.println(f));
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        Optional<Integer> newSum = list.stream()
//                .reduce(new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer integer, Integer integer2) {
//                        return integer+integer2;
//                    }
//                });

//        System.out.println("Sum using reduce:"+newSum);


//        Integer newSum2 = list.stream()
//                .reduce(0, (a,b) -> a+b);
//
//        System.out.println("Sum using Reduce: "+newSum2);
//
//        Integer minValue = list.stream()
//                .reduce(Integer.MAX_VALUE, (a,b) -> a<b ? a:b);
//
//        System.out.println("Find the min value using Reduce :"+minValue);
//
        list.stream()
                .filter(a -> a%2 != 0)
                .forEach(num -> System.out.println(num));

        list.stream()
                .filter(a -> a%2 ==0)
                .forEach(System.out::println);

        Optional<Integer> sum1 =list.stream()
                .reduce((a,b) -> a+b);

        System.out.println("Sum of list using reduce:"+ sum1);


        Optional<Integer> sum2 =list.stream()
                .reduce(Integer::sum);

        System.out.println("Sum of list using reduce:"+ sum1);


    }
}
