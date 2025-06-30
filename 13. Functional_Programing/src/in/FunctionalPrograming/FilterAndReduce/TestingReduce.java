package in.FunctionalPrograming.FilterAndReduce;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class TestingReduce {
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


        Integer newSum2 = list.stream()
                .reduce(0, (a,b) -> a+b);

        System.out.println("Sum using Reduce: "+newSum2);

        Integer minValue = list.stream()
                .reduce(Integer.MAX_VALUE, (a,b) -> a<b ? a:b);

        System.out.println("Find the min value using Reduce :"+minValue);
    }
}
