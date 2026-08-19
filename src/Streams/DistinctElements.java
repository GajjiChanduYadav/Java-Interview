package Streams;


import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5);

        List<Integer> distinctNumbers =
                numbers.stream()
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(distinctNumbers);
    }
}

//Set<Integer> seen = new HashSet<>();
//
//List<Integer> uniqueNumbers =
//        numbers.stream()
//               .filter(n -> seen.add(n))
//               .collect(Collectors.toList());

//Set.add() returns:
//
//true → element was not already present
//false → element was already present