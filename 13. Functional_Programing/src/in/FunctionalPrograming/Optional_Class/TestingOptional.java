package in.FunctionalPrograming.Optional_Class;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);

        Optional<Integer> sum =
                list.stream()
                        .reduce(Integer::sum);


        if(sum.isPresent()){
            System.out.println(sum.get());
        }else {
            System.out.println("Empty");
        }

    }
}
