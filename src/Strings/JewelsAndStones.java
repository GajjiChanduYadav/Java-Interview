package Strings;


import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args){

        String jewels = "aAb";
        String stones = "aAAbbc";
        int count =0;

//        for(int i =0;i<stones.length();i++){
//            for(int j=0;j<jewels.length();j++){
//                if(stones.charAt(i)==jewels.charAt(j)){
//                    count++;
//                    break;
//                }
//            }
//        }

        //  using set

        Set set = new HashSet();
        for(char c: jewels.toCharArray()){
            set.add(c);
        }
        for(char ch: stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }

        System.out.println(count);
    }
//Given a list of jewel types and a list of stones, count how many stones belong to the
// jewel types. Each character represents one stone, and the comparison is case-sensitive.



}
