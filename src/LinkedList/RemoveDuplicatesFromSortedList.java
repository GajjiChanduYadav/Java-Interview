package LinkedList;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

        MyLinkedListOperations list = new MyLinkedListOperations();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        list.addAtTail(50);

        System.out.println("List Before Removing Duplicates");

        list.printList();

        MyLinkedListOperations.Node current = list.head;

        while (current != null && current.next != null) {

            if (current.val == current.next.val) {

                // Remove duplicate node
                current.next = current.next.next;

            } else {

                // Move only if no duplicate found
                current = current.next;
            }
        }

        System.out.println("List After Removing Duplicates");

        list.printList();
    }
}