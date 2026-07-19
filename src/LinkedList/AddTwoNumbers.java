package LinkedList;

public class AddTwoNumbers {

    public static void main(String[] args) {

        // STEP 1 : CREATE FIRST LINKED LIST

        MyLinkedListOperations list1 = new MyLinkedListOperations();

        // Number = 342
        // Stored in reverse order as:
        // 2 -> 4 -> 3

        list1.addAtTail(2);
        list1.addAtTail(4);
        list1.addAtTail(3);

        System.out.println("First Linked List :");

        list1.printList();


        // STEP 2 : CREATE SECOND LINKED LIST

        MyLinkedListOperations list2 = new MyLinkedListOperations();

        // Number = 465
        // Stored in reverse order as:
        // 5 -> 6 -> 4

        list2.addAtTail(5);
        list2.addAtTail(6);
        list2.addAtTail(4);
        list2.addAtTail(4);

        System.out.println("Second Linked List :");

        list2.printList();


        /*
         *  List1 : 2 → 4 → 3
         *
         *  List2 : 5 → 6 → 4 -> 4
         */


        // STEP 3 : CREATE A DUMMY NODE

        // Dummy node is used to build the result list easily.
        // The actual answer starts from dummy.next.

        MyLinkedListOperations.Node dummy =
                new MyLinkedListOperations.Node(0);


        // Current always points to the last node
        // of the result linked list.

        MyLinkedListOperations.Node current = dummy;


        // Carry stores the overflow.
        //
        // Example:
        // 8 + 7 = 15
        //
        // Digit = 5
        // Carry = 1

        int carry = 0;


        // STEP 4 : START TRAVERSING BOTH LINKED LISTS

        MyLinkedListOperations.Node current1 = list1.head;

        MyLinkedListOperations.Node current2 = list2.head;


        // Continue until:
        //
        // 1. List1 becomes null
        // 2. List2 becomes null
        // 3. Carry becomes zero

        while (current1 != null || current2 != null || carry != 0) {

            // Start sum with carry.

            int sum = carry;


            // If current1 exists,
            // add its value to the sum.

            if (current1 != null) {

                sum += current1.val;

                current1 = current1.next;
            }


            // If current2 exists,
            // add its value to the sum.

            if (current2 != null) {

                sum += current2.val;

                current2 = current2.next;
            }


            // Calculate carry.
            //
            // Example:
            //
            // sum = 17
            //
            // carry = 1

            carry = sum / 10;


            // Store only the last digit.
            //
            // Example:
            //
            // 17 % 10 = 7

            MyLinkedListOperations.Node newNode =
                    new MyLinkedListOperations.Node(sum % 10);


            // Attach the new node to the result list.

            current.next = newNode;


            // Move current forward.

            current = current.next;
        }


        // STEP 5 : PRINT THE RESULT

        System.out.println("Result Linked List :");

        MyLinkedListOperations.Node result = dummy.next;

        while (result != null) {

            System.out.print(result.val + " ");

            result = result.next;
        }

        System.out.println();
    }
}