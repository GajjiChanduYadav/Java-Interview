package Strings;

public class ReverseString2 {

        public static String reverseStr(String s, int k) {

            char[] arr = s.toCharArray();

            for (int start = 0; start < arr.length; start += 2 * k) {

                int i = start;
                int j = Math.min(start + k - 1, arr.length - 1);
                // BASIC condition instead of Math.min
//                if (start + k - 1 < arr.length) {
//                    j = start + k - 1;
//                } else {
//                    j = arr.length - 1;
//                }

                // reverse from i to j
                while (i < j) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            return new String(arr);
        }

        public static void main(String[] args) {
            System.out.println(reverseStr("abcdefg", 2)); // bacdfeg
            System.out.println(reverseStr("abcd", 2));    // bacd
    }
}

///*
// * We need to reverse only the first 'k' characters starting from 'start'.
// *
// * Normally, the ending index is:
// *      start + k - 1
// *
// * Example:
// * String = "abcdefg", k = 2
// * start = 4
// * We need to reverse "ef"
// * Ending index = 4 + 2 - 1 = 5
// *
// * But what if there are fewer than k characters left?
// *
// * Example:
// * String = "abc", k = 4
// * start = 0
// * Expected ending index = 0 + 4 - 1 = 3
// *
// * Valid indices are only:
// *      0, 1, 2
// *
// * Index 3 does not exist, which would cause
// * ArrayIndexOutOfBoundsException.
// *
// * So we use Math.min() to choose the smaller value between:
// *      1. Desired ending index (start + k - 1)
// *      2. Last valid index (arr.length - 1)
// *
// * This ensures we never go beyond the array boundary and safely
// * reverse the remaining characters.
// */
//int j = Math.min(start + k - 1, arr.length - 1);