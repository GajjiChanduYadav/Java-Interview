package Streams;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingElements {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Chandu", 25),
                new User("Ravi", 30),
                new User("Kiran", 25),
                new User("Suresh", 30),
                new User("Raj", 35)
        );

        Map<Integer, List<User>> usersByAge =
                users.stream()
                        .collect(Collectors.groupingBy(User::getAge)); // user -> user.getAge()

        System.out.println(usersByAge);
    }
}

// Collectors is a class. groupingBy() is a static method of the Collectors class.
// What does groupingBy() actually do?
//
//Think about our users:
//
//Chandu  → age 25
//Ravi    → age 30
//Kiran   → age 25
//Suresh  → age 30
//Raj     → age 35
//
//We tell Java:
//
//User::getAge
//
//which means:
//
//For every User, get their age.
//
//Java uses the age as the grouping key.
//
//So:
//
//Chandu → 25
//Kiran  → 25
//
//
//Ravi   → 30
//Suresh → 30
//
//
//Raj    → 35
//
//Then Java creates groups:
//
//25 → [Chandu, Kiran]
//30 → [Ravi, Suresh]
//35 → [Raj]

// The most important pattern
//
//Whenever an interview question says:
//
//Group X by Y
//
//Immediately think:
//
//Collectors.groupingBy(...)