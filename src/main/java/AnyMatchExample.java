import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);

        boolean hasOdd = numbers.stream()
                .anyMatch(num -> num % 2 != 0);

        System.out.println(hasOdd);
    }
}
