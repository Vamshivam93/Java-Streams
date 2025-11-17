import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(34, 12, 5, 67, 23, 89, 1);
        Optional<Integer> min = nums.stream().min(Comparator.naturalOrder());
        System.out.println(min);
        Optional<Integer> max = nums.stream().max(Comparator.naturalOrder());
        System.out.println(max);
    }
}
