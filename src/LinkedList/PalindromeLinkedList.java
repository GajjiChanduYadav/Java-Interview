package LinkedList;

import java.util.LinkedList;

public class PalindromeLinkedList {

    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(20);
        list.add(100);

        Integer[] array = list.toArray(new Integer[0]); // convert list to integer
        boolean palindrome = true;

        for(int i =0;i<array.length;i++){
            if(array[i]!=array[array.length-i-1]){

               palindrome= false;
            }
        }
        if(palindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
