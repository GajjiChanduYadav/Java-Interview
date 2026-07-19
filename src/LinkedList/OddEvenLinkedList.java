package LinkedList;

public class OddEvenLinkedList {

    public static void main(String[] args){

        MyLinkedListOperations list = new MyLinkedListOperations();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        list.addAtTail(60);

        System.out.println("Before");
        list.printList();

        MyLinkedListOperations.Node odd = list.head;
        MyLinkedListOperations.Node even = list.head.next;

        MyLinkedListOperations.Node evenReference = even;

        while(even != null & even.next!= null){
            odd.next = odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenReference;
list.printList();

    }

}
