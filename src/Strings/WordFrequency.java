package Strings;

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args){
//        String str = "Geeks For Geeks";
//
//        String[] array = str.split(" ");
//
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for(int i =0;i< array.length;i++){
//            if(map.containsKey(array[i])){
//                map.put(array[i],map.get(array[i])+1 );
//            }
//            else{
//                map.put(array[i],1);
//            }
//        }
//        map.forEach((key, value) -> System.out.println(key + " - " + value));



                String sentence = "java is easy and java is powerful";

                // Step 1: Split sentence into words
                String[] words = sentence.split("\\s+");

                boolean[] b = new boolean[words.length];

                String maxWord = words[0]; // to store max frequency word
                int maxCount = 0;          // to store max frequency

                System.out.println("Word Occurrences:");

                for (int i = 0; i < words.length; i++) {

                    if (b[i]) continue;   // Skip already counted words

                    int c = 1;

                    for (int j = i + 1; j < words.length; j++) {
                        if (words[i].equals(words[j])) {
                            c++;
                            b[j] = true;  // Mark word as counted
                        }
                    }

                    System.out.println(words[i] + " : " + c);

                    // 👉 Check for maximum frequency
                    if (c > maxCount) {
                        maxCount = c;
                        maxWord = words[i];
                    }
                }

                System.out.println("\nMax frequency word:");
                System.out.println(maxWord + " : " + maxCount);
            }
        }

