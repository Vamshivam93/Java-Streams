import java.util.List;

public class LimitExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        List<String> limitedNames = names.stream()
                .limit(3)
                .toList();

        System.out.println(limitedNames);
    }
}
