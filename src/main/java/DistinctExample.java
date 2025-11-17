import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 5, 5);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .toList();

        System.out.println(distinctNumbers);
    }
}
