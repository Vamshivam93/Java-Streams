import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        List<String> nameToUpperCase = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(nameToUpperCase);
    }
}
