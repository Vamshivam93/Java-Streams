import java.util.List;

public class SkipExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        List<String> skippedNames = names.stream()
                .skip(2)
                .toList();

        System.out.println(skippedNames);
    }
}
