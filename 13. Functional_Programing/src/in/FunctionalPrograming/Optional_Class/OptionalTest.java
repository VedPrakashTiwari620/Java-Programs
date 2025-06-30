package in.FunctionalPrograming.Optional_Class;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<Integer> integerOptional = Optional.empty();
        Optional<String> stringOptional = Optional.empty();


        Optional<Integer> integerOptional1 = Optional.of(1);
        Optional<String> stringOptional1 = Optional.of("Ved Prakash");


        Optional<Integer> integerOptional2 = Optional.ofNullable(null);
        Optional<String> stringOptional2 = Optional.ofNullable(null);


        if(integerOptional.isPresent()){
            System.out.println(integerOptional.get());
        }else {
            System.out.println("Empty");
        }

        if (integerOptional1.isEmpty() || stringOptional1.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println(integerOptional1.get());
        }


        int orElseEx = integerOptional.orElse(-1);
        System.out.println("Using orElse: "+ orElseEx);

        String orElseEx1 = stringOptional.orElse("Default Values.");
        System.out.println("Using orElse: "+ orElseEx1);

        int orElseEx2 = integerOptional1.orElse(12);
        System.out.println("Using orElse: "+ orElseEx2);

        integerOptional1.ifPresent(System.out::println);
        stringOptional1.ifPresent(System.out::println);
    }


}
