import java.util.*;
import java.util.stream.Collectors;

public class StreamEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 42, 57, 60);

        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers:");
        evens.forEach(System.out::println);
    }
}
