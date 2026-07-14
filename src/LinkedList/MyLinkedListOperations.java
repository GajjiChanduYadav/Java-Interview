package LinkedList;
// Declares the package name. Helps organize related classes together.

public class MyLinkedListOperations {
// Defines the Linked List class. This class represents the entire linked list.

    // Node class (building block of Linked List)
    class Node {
        int val;
        // Stores the value/data of the node

        Node next;
        // Reference to the next node in the list

        Node(int val) {
            // Constructor of Node class
            this.val = val;
            // Assigns the passed value to node's data
            this.next = null;
            // Initially, next is null (no node is connected yet)
        }
    }

    // Head of the linked list
    Node head;
    // Points to the first node of the linked list

    int size;
    // Stores the number of nodes present in the linked list

    // Constructor of MyLinkedList
    public MyLinkedListOperations() {
        head = null;
        // Initially the list is empty, so head is null

        size = 0;
        // Initially, size of the list is 0
    }

    // Method to add a node at the beginning (head) of the list
    public void addAtHead(int val) {

        Node newNode = new Node(val);
        // Creates a new node with the given value

        newNode.next = head;  // ex: 5->4->6->7
        // head points to 5 , new node =1 created it has to be add at head
        //  newNode.next = head; means head points to 5 so new node points to 5
        //   1->5->4->6->7  after this we are changing head to newNode.
        // Links new node to the current head node

        head = newNode;
        // Updates head to point to the new node

        size++;
        // Increments the size of the list
    }

    // Method to add a node at the end (tail) of the list
    public void addAtTail(int val) {

        Node newNode = new Node(val);
        // Creates a new node with the given value

        if (head == null) {
            // If list is empty, new node becomes the head
            head = newNode;
        } else {
            Node current = head;
            // Start traversal from head

            while (current.next != null) {
                // Traverse till the last node
                current = current.next;
            }

            current.next = newNode;
            // Link last node to the new node
        }

        size++;
        // Increment the size of the list
    }

    // Method to add a node at a specific index
    public void addAtIndex(int index, int val) {

        // If index is invalid (less than 0 or greater than size),
        // do nothing and return
        if (index < 0 || index > size) {
            return;
        }

        // If index is 0, insert at the head
        if (index == 0) {
            addAtHead(val);
        }

        // If index equals size, insert at the tail
        else if (index == size) {
            addAtTail(val);
        }

        // Insert in the middle of the list
        else {
            Node newNode = new Node(val);
            // Create new node

            Node current = head;
            // Start from head

            // Traverse to the node just before the given index
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            // New node points to the next node

            current.next = newNode;
            // Previous node points to new node

            size++;
            // Increase list size
        }
    }

    // Method to get value at a specific index
    public int get(int index) {

        // If index is invalid, return -1
        if (index < 0 || index >= size) {
            return -1;
        }

        Node current = head;
        // Start traversal from head

        // Move to the node at the given index
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.val;
        // Return the value of the node at the index
    }

    // Method to delete a node at a specific index
    public void deleteAtIndex(int index) {

        // If index is invalid, do nothing
        if (index < 0 || index >= size) {
            return;
        }

        // If the first node is to be deleted
        if (index == 0) {
            head = head.next;
            // Move head to the next node
        } else {
            Node current = head;
            // Start from head

            // Traverse to the node just before the one to delete
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
            // Skip the node to be deleted
        }

        size--;
        // Decrease the size of the list
    }

    // Method to print the linked list
    public void printList() {

        Node current = head;
        // Starts traversal from the head node

        while (current != null) {
            // Continues until the end of the list is reached

            System.out.print(current.val + " ");
            // Prints the value of the current node

            current = current.next;
            // Moves to the next node
        }

        System.out.println();
        // Moves to the next line after printing the list
    }

    // Main method - entry point of the program
    public static void main(String[] args) {

        MyLinkedListOperations list = new MyLinkedListOperations();
        // Creates a new empty linked list object

        list.addAtHead(30);
        list.addAtHead(20);
        list.addAtHead(10);

        list.printList();   // 10 20 30

        list.addAtHead(5);
        list.addAtTail(11);
        list.addAtIndex(2, 25);

        list.printList();   // 5 10 25 20 30 11

        System.out.println(list.get(3)); // Gets value at index 3

        list.deleteAtIndex(2);
        list.printList();   // After deletion
    }
}
