package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {

        // STEP 1 : CREATE FIRST LINKED LIST


        MyLinkedListOperations list1 = new MyLinkedListOperations();

        list1.addAtTail(10);
        list1.addAtTail(20);
        list1.addAtTail(30);
        list1.addAtTail(40);
        list1.addAtTail(50);

        System.out.println("First Linked List:");
        list1.printList();

        /*
         * First Linked List
         *
         * head
         *  ↓
         * 10 → 20 → 30 → 40 → 50 → null
         */


        // STEP 2 : CREATE SECOND LINKED LIST


        MyLinkedListOperations list2 = new MyLinkedListOperations();

        list2.addAtTail(15);
        list2.addAtTail(25);

        System.out.println("Second Linked List Before Intersection:");
        list2.printList();

        /*
         * Second Linked List
         *
         * head
         *  ↓
         * 15 → 25 → null
         */



        // STEP 3 : SELECT THE NODE WHERE INTERSECTION SHOULD START


        // We want both linked lists to intersect at node 40.
        // Node 40 is at index 3.

        int index = 3;

        // Start traversal from the head of first linked list.
        MyLinkedListOperations.Node intersectionNode = list1.head;

        // Move 'index' times to reach node 40.
        //
        // Iteration 1 -> 20
        // Iteration 2 -> 30
        // Iteration 3 -> 40
        for (int i = 0; i < index; i++) {
            intersectionNode = intersectionNode.next;
        }

        /*
         *        intersectionNode
         *                ↓
         * 10 → 20 → 30 → 40 → 50
         */



        // STEP 4 : FIND THE LAST NODE OF SECOND LINKED LIST


        // Start from head of second linked list.
        MyLinkedListOperations.Node tail = list2.head;

        // Traverse until the last node.
        while (tail.next != null) {
            tail = tail.next;
        }

        /*
         * tail
         *  ↓
         * 15 → 25 → null
         */


        // STEP 5 : CREATE THE INTERSECTION


        // Connect the last node of second linked list
        // to node 40 of first linked list.
        //
        // Before:
        //
        // 15 → 25 → null
        //
        // After:
        //
        // 15 → 25
        //        \
        //         40 → 50

        tail.next = intersectionNode;



        // FINAL STRUCTURE


        /*
         * First Linked List
         *
         * 10 → 20 → 30 → 40 → 50
         *                ↑
         *                |
         * 15 → 25 ───────┘
         *
         * Second Linked List
         */



        // PRINT SECOND LINKED LIST AFTER INTERSECTION


        System.out.println("Second Linked List After Intersection:");

        MyLinkedListOperations.Node current = list2.head;

        while (current != null) {

            System.out.print(current.val + " ");

            current = current.next;
        }

        System.out.println();

        // Brute force approach
        // Traverse every node of the first linked list.
//
// For each node in the first linked list,
// traverse the entire second linked list and
// compare the node references (NOT the values).

//if (current1.val == current2.val)  dont compare values
        //because two different nodes can have the same value.

// If both node references point to the same Node object,
// then the linked lists intersect.
//
// If no matching node reference is found after checking
// all nodes, then the linked lists do not intersect.

// ==========================================================
// BRUTE FORCE APPROACH
// Time Complexity : O(m * n)
// Space Complexity : O(1)
// ==========================================================

// Start traversing the first linked list.
//        MyLinkedListOperations.Node current1 = list1.head;
//
//// Variable to store the intersection node.
//        MyLinkedListOperations.Node intersection = null;
//
//// Traverse every node of the first linked list.
//        while (current1 != null) {
//
//            // For each node of the first linked list,
//            // start traversing the second linked list.
//            MyLinkedListOperations.Node current2 = list2.head;
//
//            while (current2 != null) {
//
//                // Compare the node references.
//                // Do NOT compare values.
//                if (current1 == current2) {
//                    intersection = current1;
//                    break;
//                }
//
//                // Move to the next node of the second linked list.
//                current2 = current2.next;
//            }
//
//            // If intersection is found, no need to continue.
//            if (intersection != null) {
//                break;
//            }
//
//            // Move to the next node of the first linked list.
//            current1 = current1.next;
//        }
//
//// Print the result.
//        if (intersection != null) {
//            System.out.println("Intersection Found at Node : " + intersection.val);
//        } else {
//            System.out.println("No Intersection Found");
//        }

// optimal approach ============SET====================
        // HashSet (Better)
        //O(m + n) // time
        //O(n) space

//        Set<MyLinkedListOperations.Node> visited = new HashSet<>();
//
//// Store all nodes of List2 in the HashSet.
//        MyLinkedListOperations.Node headB = list2.head;
//
//        while (headB != null) {
//            visited.add(headB);
//            headB = headB.next;
//        }
//
//// Traverse List1 and check whether the current node
//// is already present in the HashSet.
//        MyLinkedListOperations.Node headA = list1.head;
//
//        while (headA != null) {
//
//            if (visited.contains(headA)) {
//                System.out.println("Intersection Found at Node : " + headA.val);
//                break;
//            }
//
//            headA = headA.next;
//        }
//
//// If headA becomes null, there is no intersection.
//        if (headA == null) {
//            System.out.println("No Intersection Found");
//        }

        // ==========================================================
// OPTIMAL APPROACH (Two Pointer)
// Time Complexity : O(m + n)
// Space Complexity : O(1)
// ==========================================================

// Pointer1 starts from the first linked list.
        MyLinkedListOperations.Node pointer1 = list1.head;

// Pointer2 starts from the second linked list.
        MyLinkedListOperations.Node pointer2 = list2.head;

// Traverse until both pointers become equal.
// They will either meet at the intersection node
// or both become null (if there is no intersection).
        while (pointer1 != pointer2) {

            // If pointer1 reaches the end of List1,
            // move it to the head of List2.
            // Otherwise, move to the next node.
            if (pointer1 == null) {
                pointer1 = list2.head;
            } else {
                pointer1 = pointer1.next;
            }

            // If pointer2 reaches the end of List2,
            // move it to the head of List1.
            // Otherwise, move to the next node.
            if (pointer2 == null) {
                pointer2 = list1.head;
            } else {
                pointer2 = pointer2.next;
            }
        }

// If both pointers are null,
// there is no intersection.
        if (pointer1 == null) {
            System.out.println("No Intersection Found");
        } else {
            System.out.println("Intersection Found at Node : " + pointer1.val);
        }

    }
}


//Interview Answer
//
//If the interviewer asks:
//
//Why is the HashSet approach O(m + n)?
//
//You can answer:
//
//We traverse the second linked list once and insert each node into the HashSet. Each add() operation is average O(1), so this step is O(n).
//We then traverse the first linked list once and check each node using contains(). Each lookup is average O(1), so this step is O(m).
//Therefore, the total time complexity is O(m + n), and the extra space used by the HashSet is O(n).
//
//This is the explanation interviewers typically expect.