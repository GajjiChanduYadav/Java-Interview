package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsContainsChar {
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc","hjgja"};
        char x = 'a';

//        List<Integer> list = new ArrayList<>();
//        for(int i =0; i< words.length;i++){
//            for(char c : words[i].toCharArray()){
//                if(c==x){
//                    list.add(i);
//                    break;
//                }
//            }
//        }
//        System.out.println(list);

        // Preallocate with maximum possible size (at most all words can match)
        int[] result = new int[words.length];
        int size = 0; // how many valid indices we actually collect

        // Traverse each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean found = false;

            // Scan each character of the current word
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == x) {
                    found = true;   // mark as found
                    break;          // stop scanning this word
                }
            }

            // If the word contains x, store its index into result
            if (found) {
                result[size] = i;   // "append" index i at the next free slot
                size++;             // move the write pointer forward
            }
        }

        // If nothing matched, print a friendly message and exit
        if (size == 0) {
            System.out.println("No word is there");
            return;
        }

        // Build an exact-sized array with only the collected indices
        int[] exact = new int[size];
        for (int i = 0; i < size; i++) {
            exact[i] = result[i];
        }

        // Print as a nice array string, e.g., [0, 1]
        System.out.println(Arrays.toString(exact));

    }
}
