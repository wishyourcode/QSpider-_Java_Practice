package stream;

import java.util.Arrays;
import java.util.List;

public class Filters {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 3, 1, 9);
        numbers.stream()
                .filter(n -> n > 5)
                .forEach(System.out::println);
    }
}
