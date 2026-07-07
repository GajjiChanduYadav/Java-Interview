package Strings;

//This problem requires finding the most frequently occurring vowel and consonant characters
//in a string, and returning the sum of their frequencies.

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMostFrequentVowelAndConsonant {
    public static void main(String[] args){
        String s ="successes";

        Map<Character, Integer> map = new HashMap<>();

        for(int i =0;i<s.length();i++){
            char ch =s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);

            }
            else{
                map.put(ch,1);
            }

        }
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        int maxVowel =0;
        int maxConsonant = 0;

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);

            if(vowels.contains(ch)){
                if(map.get(ch)>maxVowel){
                    maxVowel=map.get(ch);
                }
            }
            else{
                if(map.get(ch)>maxConsonant){
                    maxConsonant=map.get(ch);
                }
            }
        }
        int sum = maxConsonant+maxVowel;
        System.out.println(sum);
    }
}

//// Step 3: Iterate over map entries
//        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
//
//char ch = entry.getKey();      // character
//int count = entry.getValue(); // frequency
//
//            if (vowels.contains(ch)) {
//maxVowel = Math.max(maxVowel, count);
//            } else {
//maxConsonant = Math.max(maxConsonant, count);
//            }
//                    }
