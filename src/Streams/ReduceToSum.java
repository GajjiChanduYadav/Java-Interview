package Streams;

import java.util.List;
import java.util.Arrays;

public class ReduceToSum {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
// reduce is terminal operation
 // 0 is the initial value Initial value = 0
//
//0 + 1 = 1
//1 + 2 = 3
//3 + 3 = 6
//6 + 4 = 10
//10 + 5 = 15

// reduce() vs Sum()
// numbers.stream()
//       .mapToInt(Integer::intValue)
//       .sum();
//is simpler.
//
//But reduce() is more general.
//
//For example, Java doesn't have a direct Stream operation called multiply():
//
//numbers.stream()
//       .reduce(1, (a, b) -> a * b);
//
//So:
//
//sum() is specifically for addition, while reduce() can combine elements using your own operation.

//Interview definition
//
//reduce() is a terminal Stream operation used to combine all elements of a Stream into a single
// result, such as sum, product, maximum, minimum, or another custom calculation.