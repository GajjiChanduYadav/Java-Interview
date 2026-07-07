package Strings;
//This problem focuses on splitting a string into the maximum number of balanced substrings.
// A string is considered balanced if it contains an equal number of ‘L’ and ‘R’ characters.
// The goal is to iterate through the string and count how many such balanced splits can be
// formed.
public class BalancedString {
    public static void main(String[] args){
        String s = "RLRRLLRLRL";

        // here rl , rrll, rl, rl 4 substrings

        int r =0;
        int l=0;
        int count=0;

        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='R'){
                r++;
            }
            else{
                l++;
            }
            if(r == l){
                count++;
            }
        }
        System.out.println(count);
    }
}
