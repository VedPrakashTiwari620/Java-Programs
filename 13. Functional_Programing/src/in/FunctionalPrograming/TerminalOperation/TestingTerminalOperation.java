package in.FunctionalPrograming.TerminalOperation;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestingTerminalOperation {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);


        //Find max Element using stream terminal operation
        Optional<Integer> maxElement =
                numbers.stream()
                        .max(Integer::compareTo);
        maxElement.ifPresent(System.out::println);


        //Find min Element using stream terminal operation
        Optional<Integer> minElement =
                numbers.stream()
                        .min(Integer::compareTo);
        minElement.ifPresent(System.out::println);



        //Collects the elements of the stream into a list using stream collect terminal operation
        List<String> words = Arrays.asList("Stream", "Operations", "In", "Java");
        List<String> collectsWord =
                words.stream()
                        .toList();


        System.out.println(collectsWord);




        //Collect distinct elements using stream Intermediate Operation
        words = Arrays.asList("Apple", "Apple", "Banana", "Mango","Lichi","Guava","Lichi");
        List<String> collectDistict =
                words.stream()
                        .distinct()
                        .toList();
        System.out.println(collectDistict);


        //Map using transforming them into new stream
        List<String > mapStream =
                words.stream()
                        .map(String::toUpperCase)
                        .toList();
        System.out.println(mapStream);



        //Sort a list using stream sorted() Intermediate operations
        numbers = List.of(1,23,3,45,3,54,11,1,2,3,4,5,6,7,8,9);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
