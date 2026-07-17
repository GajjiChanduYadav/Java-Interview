package LinkedList;

import java.util.LinkedList;

public class PalindromeLinkedList {

    public static void main(String[] args){

//        LinkedList<Integer> list = new LinkedList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(30);
//        list.add(20);
//        list.add(100);
//
//        Integer[] array = list.toArray(new Integer[0]); // convert list to integer
//        boolean palindrome = true;
//
//        for(int i =0;i<array.length;i++){
//            if(array[i]!=array[array.length-i-1]){
//
//               palindrome= false;
//            }
//        }
//        if(palindrome){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }

        // approach 2 we wont use any extra space
        //- Use two pointers (`slow`and`fast`) to find the middle of the linked list.
        //- Reverse the second half of the list.
        //- Compare the first and second halves node by node.

        MyLinkedListOperations list = new MyLinkedListOperations();
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);
        list.addAtHead(20);
        list.addAtHead(10);
//        list.addAtHead(10);
        list.printList();

        // find middle node

        MyLinkedListOperations.Node slow = list.head;
        MyLinkedListOperations.Node fast = list.head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }

        // reverse second half

        MyLinkedListOperations.Node prev = null;

        while(slow != null){
            MyLinkedListOperations.Node temp = slow.next;

            slow.next = prev;
            prev=slow;
            slow=temp;
        }
        // compare halves

        MyLinkedListOperations.Node first = list.head;
        MyLinkedListOperations.Node second = prev;
        boolean palindrome = true;

        while(second != null){
            if(first.val != second.val){
                palindrome = false;
               break;

            }
            first = first.next;
            second = second.next;
        }
      if(palindrome){
          System.out.println("palindrome");
      }else{
          System.out.println("not a palindrome");
      }
    }
}
