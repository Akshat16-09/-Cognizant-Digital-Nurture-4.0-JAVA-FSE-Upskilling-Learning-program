import java.util.*;
import java.util.stream.Collectors;

// Record (Java 16+)
record Person(String name, int age) {}

public class RecordDemo {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 17),
                new Person("Charlie", 30)
        );

        System.out.println("All people:");
        people.forEach(System.out::println);

        List<Person> adults = people.stream()
                .filter(p -> p.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("\nAdults:");
        adults.forEach(System.out::println);
    }
}
