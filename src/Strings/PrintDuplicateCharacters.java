package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacters {
    public static void main(String[] args){
//        String str = "Hello World";
//        boolean[] visited = new boolean[str.length()];
//
//        for(int i=0;i<str.length();i++){
//            if(visited[i]){
//                continue;
//            }
//            for(int j=i+1;j<str.length();j++){
//                if(str.charAt(i)==str.charAt(j)){
//                    visited[j]=true;
//                    System.out.println(str.charAt(i));
//                    break;
//                }
//            }
//        }

        // using hashmap

//        String str= "Programming";
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for(char ch: str.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1); // Give me the current count. If not present, assume count is 0.
//        }
//
//        System.out.println("print duplicates");
//        for(Map.Entry<Character, Integer> entry:map.entrySet()){ //Go through every Key=Value pair  one by one
//
//            if(entry.getValue()>1){
//                System.out.println(entry.getKey());
//
//            }
//        }

        // using set
        String str = "programming jjvv";

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
    //seen.add(ch)
    //Returns true → if element was NOT already present
    //
    //Returns false → if element is already in the set
    //
    //if (!seen.add(ch))
    //Means:
    //👉 If already seen → it is a duplicate.

}


//After Loop Completes
//
//Map becomes:
//
//{
//p=1,
//r=2,
//o=1,
//g=2,
//a=1,
//m=2,
//i=1,
//n=1
//}
//What is entrySet()?
//
//Now we want to read all map entries.
//
//Map:
//
//{
//p=1,
//r=2,
//o=1
//}
//
//HashMap internally stores:
//
//p=1
//
//r=2
//
//o=1
//
//Each pair:
//
//Key=Value
//
//is called:
//
//Entry
//What is Entry?
//
//Example:
//
//p=1
//
//One Entry.
//
//r=2
//
//Another Entry.
//
//Think:
//
//Student = Marks
//
//Example:
//
//John = 90
//Ravi = 85
//
//Each row is an Entry.
//
//What is entrySet()?
//
//Returns all entries.
//
//Example:
//
//map.entrySet()
//
//Returns:
//
//[p=1, r=2, o=1]
//
//Collection of all entries.
