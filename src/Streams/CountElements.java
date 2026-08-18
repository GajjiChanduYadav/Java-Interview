package Streams;

import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35);

//        long count = numbers.stream()
//                .count();
//
//        System.out.println(count);

        long count = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println(count);
    }
}

// The filter method removes elements that don't satisfy the condition, and
//count returns the number of elements remaining.