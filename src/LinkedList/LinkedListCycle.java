package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public static void main(String[] args) {

        // ---------------- CREATE LINKED LIST ----------------

        MyLinkedListOperations list = new MyLinkedListOperations();

        list.addAtTail(3);
        list.addAtTail(2);
        list.addAtTail(0);
        list.addAtTail(-4);

        /*
         * Linked List before creating cycle
         *
         * head
         *  ↓
         * 3 → 2 → 0 → -4 → null
         */


        // ---------------- CREATE A CYCLE ----------------

        // Find the last node
        MyLinkedListOperations.Node tail = list.head;

        while (tail.next != null) {
            tail = tail.next;
        }

        // Select the node where the cycle should begin
        // head.next means node with value 2
        MyLinkedListOperations.Node cycleNode = list.head.next;

        // Connect last node to second node
        tail.next = cycleNode;

        /*
         * Final Linked List
         *
         * head
         *  ↓
         * 3 → 2 → 0 → -4
         *     ↑         |
         *     |_________|
         */


        // =====================================================
        // APPROACH 1 : USING HASHSET
        // =====================================================

        /*
        Set<MyLinkedListOperations.Node> visited = new HashSet<>();

        MyLinkedListOperations.Node current = list.head;

        while (current != null) {

            // If current node is already present in HashSet,
            // then cycle exists.
            if (visited.contains(current)) {
                System.out.println("Cycle Found");
                return;
            }

            visited.add(current);

            current = current.next;
        }

        System.out.println("No Cycle");
        */


        // =====================================================
        // APPROACH 2 : FLOYD'S CYCLE DETECTION (SLOW & FAST)
        // =====================================================

        /*
         * Slow pointer moves one step.
         * Fast pointer moves two steps.
         *
         * If a cycle exists,
         * both pointers will eventually meet.
         */

        MyLinkedListOperations.Node slow = list.head;
        MyLinkedListOperations.Node fast = list.head;

        // Empty list or single node means no cycle
        if (fast == null || fast.next == null) {
            System.out.println("No Cycle");
            return;
        }

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Cycle Found");
                return;
            }
        }

        System.out.println("No Cycle");
    }
}