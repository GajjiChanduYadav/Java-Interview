package LinkedList;

public class MergeTwoSortedList {

    public static void main(String[] args) {

        // STEP 1 : CREATE FIRST SORTED LINKED LIST

        MyLinkedListOperations list1 = new MyLinkedListOperations();

        list1.addAtTail(1);
        list1.addAtTail(2);
        list1.addAtTail(4);

        System.out.println("First Linked List :");

        list1.printList();

        /*
         * head
         *  ↓
         * 1 → 2 → 4 → null
         */


        // STEP 2 : CREATE SECOND SORTED LINKED LIST

        MyLinkedListOperations list2 = new MyLinkedListOperations();

        list2.addAtTail(1);
        list2.addAtTail(3);
        list2.addAtTail(4);
        list2.addAtTail(5);

        System.out.println("Second Linked List :");

        list2.printList();

        /*
         * head
         *  ↓
         * 1 → 3 → 4 → 5 -> null
         */


        // STEP 3 : CREATE A DUMMY NODE

        // Dummy node helps us build the merged list.
        // The merged list will actually start from dummy.next.

        MyLinkedListOperations.Node dummy =
                new MyLinkedListOperations.Node(0);


        // Current always points to the last node
        // in the merged linked list.

        MyLinkedListOperations.Node current = dummy;


        // STEP 4 : CREATE POINTERS FOR BOTH LISTS

        MyLinkedListOperations.Node current1 = list1.head;

        MyLinkedListOperations.Node current2 = list2.head;


        // STEP 5 : MERGE BOTH LISTS

        while (current1 != null && current2 != null) {

            // Compare both node values.

            if (current1.val < current2.val) {

                // Attach current1 node.

                current.next = current1;

                // Move current1 forward.

                current1 = current1.next;

            } else {

                // Attach current2 node.

                current.next = current2;

                // Move current2 forward.

                current2 = current2.next;
            }

            // Move current forward
            // because one node has been added.

            current = current.next;
        }


        // STEP 6 : ATTACH THE REMAINING NODES

        // If List1 still has nodes,
        // attach them.

        if (current1 != null) {

            current.next = current1;
        }

        // Otherwise attach remaining List2 nodes.

        else {

            current.next = current2;
        }


        // STEP 7 : PRINT THE MERGED LINKED LIST

        System.out.println("Merged Linked List :");

        MyLinkedListOperations.Node result = dummy.next;

        while (result != null) {

            System.out.print(result.val + " ");

            result = result.next;
        }

        System.out.println();
    }
}