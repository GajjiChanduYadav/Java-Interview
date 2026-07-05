package Strings;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args){
//        String s = "alonefighter";
//        char[] array = s.toCharArray();
//        boolean[] visited = new boolean[s.length()];
//
//        char maxChar = array[0];
//        int maxCount = 0;
//
//
//        for(int i =0;i<s.length();i++){
//            if(visited[i]){
//                continue;       // Skip already counted characters
//            }
//            int count =1;
//            for(int j=i+1;j<s.length();j++){
//                if(array[i]==array[j]){
//                    count ++;
//                    visited[j] = true;
//                }
//            }
//            System.out.println(array[i] + ":" + count); // printing frequency of chars
//
//            if(count > maxCount){  // finding max repeated char
//                maxCount= count;
//                maxChar=array[i];
//            }
//        }
//        System.out.println(maxChar);

        String s = "Alone Fighter";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        map.forEach((k,v)-> System.out.println(k+" : "+ v));

    }
}
