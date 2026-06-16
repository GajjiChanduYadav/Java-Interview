package Strings;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in); // chandu is a good boy
//        String input = sc.nextLine();
//        String reverse="";
//        for(int i=0;i<input.length();i++){
//            reverse=input.charAt(i)+reverse;
//        }
//          for(int i=input.length()-1;i>=0;i--){
//                    reverse=reverse+input.charAt(i);
//                }
//        System.out.println(reverse);


//        String s = "Sachin Tendulkar";
//        char[] chars = s.toCharArray();  using character Array
//        for(int i = chars.length-1; i>=0;i--){
//            System.out.print(chars[i]);
//        }

        // using String builder

//        String s = "I love My India";
//
//        StringBuilder res = new StringBuilder();
//         res.append(s);
//
//         res.reverse();
//        System.out.println(res);

        String s ="Java is a coding language";

        char[] array = s.toCharArray();
        int start = 0;
        int end = array.length-1;

        while(start<end){
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.print(array);

//        ## Time & Space Complexity
//
//|     Method | Time | Space |
//|     --- | --- | --- |
//| StringBuilder | O(n) | O(n) |
//| For loop (`+=`) | O(n²) | O(n) |
//| Char array swap | O(n) | O(1) |



    }



}
