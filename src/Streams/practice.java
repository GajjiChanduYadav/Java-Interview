package Streams;

import java.util.Arrays;
import java.util.List;

public class practice {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Alice", "Bob", "Charlie");

      List<String> result = words.stream().map(String::toUpperCase).toList();

        System.out.println(result);
    }
}
