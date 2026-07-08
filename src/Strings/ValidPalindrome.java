package Strings;
//This approach checks if a string is a valid palindrome by using two pointers.
// It ignores non-alphanumeric characters and is case-insensitive.
// A valid palindrome reads the same forward and backward after filtering.

public class ValidPalindrome {
    public static void main (String[] args){
        String s = "Race a car";
         boolean palindrome=true;

        int i =0;
        int j=s.length()-1;
        while(i<j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!Character.isLetterOrDigit(ci)) {
                i++;
            } else if (!Character.isLetterOrDigit(cj)) {
                j--;
            } else if (Character.toLowerCase(ci) != Character.toLowerCase(cj)) {
                palindrome = false;
                break;
            }
            else{
                i++;
                j--;
            }
        }


        if(palindrome){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

        }
    }

