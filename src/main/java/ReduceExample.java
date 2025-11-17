import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
           // numbers.stream().reduce((a, b) -> a + b)
                     numbers.stream().reduce(Integer::sum)
                    .ifPresent(sum -> System.out.println("Sum: " + sum));
    }
}
