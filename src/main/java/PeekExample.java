import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15, 20, 25);

        numbers.stream()
                .peek(num -> System.out.println("Original number: " + num))
                .map(num -> num * 2)
                .peek(num -> System.out.println("Doubled number: " + num))
                .toList();
    }
}
