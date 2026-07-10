package Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagrame";
        String t = "nagaramf";

//        if (s.length() != t.length()) {
//            System.out.println("Not Anagram");
//            return;
//        }
//
//        boolean[] visited = new boolean[t.length()];
//        boolean isAnagram = true;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            boolean found = false;
//
//            for (int j = 0; j < t.length(); j++) {
//
//                // Step 1: Check whether the current character in t
//                // has already been used or not.
//                if (!visited[j]) {
//
//                    // Step 2: Compare characters.
//                    if (s.charAt(i) == t.charAt(j)) {
//
//                        // Step 3: Mark this character as used.
//                        visited[j] = true;
//
//                        // Step 4: Match found.
//                        found = true;
//
//                        // Step 5: Stop searching for the current character.
//                        break;
//                    }
//                }
//            }
//
//            // If no matching character is found,
//            // strings are not anagrams.
//            if (!found) {
//                isAnagram = false;
//                break;
//            }
//        }
//
//        if (isAnagram) {
//            System.out.println("Valid Anagram");
//        } else {
//            System.out.println("Not Anagram");
//        }

        // uisng hashmap

        if (s.length() != t.length()) {
            System.out.println("Not Anagram");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of first string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Reduce frequency using second string
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (!map.containsKey(ch)) {
                System.out.println("Not Anagram");
                return;
            }

            map.put(ch, map.get(ch) - 1);
        }

        // Step 3: Check whether every frequency became zero
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() != 0) {

                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Valid Anagram");
    }
}