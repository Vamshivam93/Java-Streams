import java.util.List;

public class FindFirstExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        String firstName = names.stream()
                .findFirst()
                .orElse("No names available");

        Integer firstNumber = numbers.stream().filter(n -> n%2 == 0)
                .findFirst()
                .orElse(-1);

        System.out.println("First name: " + firstName);
        System.out.println("First even number: " + firstNumber);
    }
}
