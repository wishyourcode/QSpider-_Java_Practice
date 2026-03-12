package stream;

import java.util.*;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Piyush", "Rahul", "Vishal", "Mishra");
        names.stream().forEach(name -> System.out.println(name));
    }
}
