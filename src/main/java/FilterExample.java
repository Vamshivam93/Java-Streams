import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 40);
       List<Integer> evenNumbers =  numbers.stream()
               .filter(num -> num % 2 == 0)
               .toList();
        System.out.println(evenNumbers);
    }
}
