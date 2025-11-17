import java.util.Collection;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = List.of(
                List.of("Banana","Apple"),
                List.of("Carrot","Cabbage"),
                List.of("Eggplant","Date")
                );

       // listOfLists.stream().flatMap(list->list.stream())
        listOfLists.stream().flatMap(Collection::stream)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
