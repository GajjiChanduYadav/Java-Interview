package Strings;

//# **Largest Odd Number in a String**
//
//The task is to find the largest-valued odd number that can be formed from a given numeric string by removing trailing even digits. The number must be a substring starting from index 0 to some valid index.
//
//You are given a string `num`, representing a large integer. Return *the **largest-valued odd** integer (as a string) that is a **non-empty substring** of* `num`*, or an empty string* `""` *if no odd integer exists*.
//
//A **substring** is a contiguous sequence of characters within a string.
//
//**Example 1:**
//
//```
//Input: num = "52"
//Output: "5"
//Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
//
//```
//
//**Example 2:**
//
//```
//Input: num = "4206"
//Output: ""
//Explanation: There are no odd numbers in "4206".
//
//```
//
//**Example 3:**
//
//```
//Input: num = "35427"
//Output: "35427"
//Explanation: "35427" is already an odd number.
//
//```
//


public class LargestOddNumber {
    public static void main(String[] args){

        String s ="3542";
        int n = s.length() - 1;
        while (n >= 0) {
            if ((s.charAt(n) - '0') % 2 == 1) {
                System.out.println(s.substring(0, n + 1));
                break;
            }
            n--;
        }
        System.out.println(" ");    }
}

//Why do we subtract '0'?
//
//charAt() returns a character, not an integer. Characters like '7' are stored using
// their ASCII/Unicode values. By subtracting '0', we convert the digit character into
// its corresponding numeric value. For example, '7' - '0' becomes 55 - 48 = 7.
// This allows us to perform numeric operations like % 2 to check whether the digit is
// odd or even.