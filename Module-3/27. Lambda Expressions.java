import java.util.*;

public class LambdaSortDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Bob", "Alice", "John");

        // Sort using lambda
        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names:");
        names.forEach(System.out::println);
    }
}
