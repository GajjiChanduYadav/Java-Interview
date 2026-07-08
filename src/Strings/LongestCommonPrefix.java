package Strings;

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string `""`.
//
//**Example 1:**
//
//```
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//
//```
//
//**Example 2:**
//
//```
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//
//```
//




public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        int x = 0;
        boolean found = false;

        while (x < strs[0].length()) {

            char ch = strs[0].charAt(x);

            for (int i = 1; i < strs.length; i++) {

                if (x == strs[i].length() || ch != strs[i].charAt(x)) {

                    System.out.println(strs[0].substring(0, x));
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }

            x++;
        }

        if (!found) {
            System.out.println(strs[0]);
        }
    }
}