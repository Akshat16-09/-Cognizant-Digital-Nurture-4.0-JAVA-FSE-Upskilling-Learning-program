import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many names do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(scanner.nextLine());
        }

        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
