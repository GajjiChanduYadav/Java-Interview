package LinkedList;

// find middle node in a single linked list

import java.util.LinkedList;

public class MiddleNode {
    public static void main(String[] args){

//        LinkedList<Integer> list = new LinkedList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(100);
//        list.add(40);
//        list.add(50);

        // cover LinkedList to array
       // new Integer[0] is passed to toArray() to specify that the required return type is Integer[].
        // The 0 creates an empty array. Since the array is smaller than the list size, Java creates
        // a new Integer[] of the required size, copies the list elements into it, and returns it.

//        Integer[] array = list.toArray(new Integer[0]);
//
//        int midIndex = array.length/2; // For odd length, this is the middle
//                                      // For even length, this gives right middle
//
//        System.out.println(array[midIndex]);
        // For Java LinkedList, adding at the end is O(1) per add() because it maintains a tail reference.
        //
        //For n elements:
        //
        //n × O(1) = O(n)

        //// Space Complexity: O(n)
        //// A new Integer array of size n is created to store all elements.

        // 2 pointer approach
        //- Use two pointers slow and `fast`.
        //- Initialize both at the head of the list.
        //- Move`slow`one step andfast`two steps at a time.
        //- When fast`reaches the end,`slow`will be at the middle.
        //- **Time Complexity:**`O(n)`
        //- **Space Complexity:**O(1)`

        MyLinkedListOperations list = new MyLinkedListOperations(); // using existing operations

        list.addAtHead(101);
        list.addAtHead(120);
        list.addAtHead(130);
        list.addAtHead(11);
        list.addAtHead(19);
        list.addAtHead(190);
        list.addAtHead(199);
        list.addAtHead(198);

        list.printList();

        MyLinkedListOperations.Node slow = list.head; // the head variable belongs to list object
        MyLinkedListOperations.Node fast = list.head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);





    }
}
