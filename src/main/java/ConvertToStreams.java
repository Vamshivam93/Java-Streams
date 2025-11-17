import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStreams {

    public static void main(String[] args) {
        int[] primitiveArray = {1,2,3,4,5};

        Integer[] objectArray = {1,5,8,9,7,6};

       final IntStream intStream =  Arrays.stream(primitiveArray);

       intStream.forEach(System.out::println);

       final Stream<Integer> integerStream = Stream.of(objectArray);

       integerStream.forEach(System.out::println);

        List<String> stringList = List.of("Jack", "Jill", "Hill", "Bill");

        stringList.stream().filter(name->name.startsWith("J"))
                .forEach(System.out::println);



    }
}
