package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args){

        MyLinkedListOperations list = new MyLinkedListOperations();

        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
        list.addAtHead(4);
        list.addAtHead(5);

        list.printList();

        MyLinkedListOperations.Node prev = null;
        MyLinkedListOperations.Node curr = list.head;

        while(curr!=null){
            MyLinkedListOperations.Node temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr= temp;
        }
        list.head = prev;
        System.out.println("After Reverse:");
        list.printList();
    }
}
