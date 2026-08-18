package Streams;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 25, 5, 40, 15, 30);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
