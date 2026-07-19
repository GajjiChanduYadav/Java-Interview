package LinkedList;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {

        // 2 pass approach
        //1st pass is to find length of a linked list and 2nd pass is  to reach previous node of the
        // one to be deleted

        // STEP 1 : CREATE THE LINKED LIST

        MyLinkedListOperations list = new MyLinkedListOperations();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);

        System.out.println("Original Linked List:");

        list.printList();

        /*
         * head
         *  ↓
         * 10 → 20 → 30 → 40 → 50 → null
         */


        // Remove the 2nd node from the end.
        // Expected Output:
        // 10 → 20 → 30 → 50

        int n = 2;


        // STEP 2 : CREATE A DUMMY NODE

        // Dummy node helps us handle the case
        // where the head node itself has to be removed.
        MyLinkedListOperations.Node dummy =
                new MyLinkedListOperations.Node(0);

        dummy.next = list.head;

        /*
         * dummy
         *   ↓
         *   0 → 10 → 20 → 30 → 40 → 50
         */


        // STEP 3 : FIND THE LENGTH OF THE LINKED LIST

        int length = 0;

        MyLinkedListOperations.Node current = list.head;

        while (current != null) {

            length++;

            current = current.next;
        }

        System.out.println("Length : " + length);


        // STEP 4 : FIND THE NODE BEFORE THE NODE TO DELETE

        // Start from dummy node.
        MyLinkedListOperations.Node prev = dummy;

        // Move (length - n) times.
        for (int i = 0; i < length - n; i++) {

            prev = prev.next;
        }

        /*
         * For List:
         * 10 → 20 → 30 → 40 → 50
         *
         * length = 5
         * n = 2
         *
         * length - n = 3
         *
         * prev stops at node 30.
         */


        // STEP 5 : DELETE THE NTH NODE FROM END

        prev.next = prev.next.next;


        // STEP 6 : UPDATE THE HEAD

        list.head = dummy.next;


        // STEP 7 : PRINT THE UPDATED LIST

        System.out.println("Linked List After Deletion:");

        list.printList();
    }
}

// OPTIMAL APPROACH ONE PASS

//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//        // 1️⃣ Create a dummy/sentinel node before the head
//        // Why?
//        // - It simplifies deletion, especially when the node to delete is the head itself.
//        // - Ensures we always have a 'previous' node available.
//        ListNode sentinel = new ListNode(0);
//        sentinel.next = head;
//
//        // 2️⃣ Create two pointers (first & second), both starting at sentinel
//        ListNode first = sentinel;
//        ListNode second = sentinel;
//
//        // 3️⃣ Move 'first' pointer n steps ahead
//        // After this, the gap between 'first' and 'second' is n nodes.
//        for (int i = 0; i < n; i++) {
//            first = first.next;
//        }
//
//        // 4️⃣ Move both pointers until 'first' reaches the last node
//        // When first.next == null → first is at the last node
//        // At that moment:
//        // - second is JUST BEFORE the node that needs to be deleted
//        while (first.next != null) {
//            first = first.next;
//            second = second.next;
//        }
//
//        // 5️⃣ Skip the target node by adjusting the pointer
//        // second.next is the node we want to delete
//        second.next = second.next.next;
//
//        // 6️⃣ Return the actual head (sentinel.next) because the head might have changed
//        return sentinel.next;
//    }
//}
