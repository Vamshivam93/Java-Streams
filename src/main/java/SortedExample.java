import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 8, 1, 4,20,45,4,8,9,7,6,1,6,3,2,5);
// Sorting will by default be in ascending order
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);
        // Sorting in descending order
        List<Integer> descSortedNumbers = numbers.stream()
                .sorted((a, b) -> b - a)
                .toList();
        System.out.println(descSortedNumbers);
        //or using Comparator
        List<Integer> descSortedNumbers2 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(descSortedNumbers2);

        // sort strings by length
        List<String> fruits = List.of("Apple", "Banana", "Kiwi", "Pineapple", "Mango", "Grapes");
        List<String> sortedFruits = fruits.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(sortedFruits);
    }
}
