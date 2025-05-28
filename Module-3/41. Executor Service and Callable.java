import java.util.concurrent.*;
import java.util.*;

public class ExecutorServiceExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = Arrays.asList(
            () -> "Result 1",
            () -> "Result 2",
            () -> "Result 3"
        );

        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> future : results) {
            System.out.println("Received: " + future.get());
        }

        executor.shutdown();
    }
}
