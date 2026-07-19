package LinkedList;

public class RemoveLinkedListElement {

    public static void main(String[] args){
        MyLinkedListOperations list = new MyLinkedListOperations();

        list.addAtTail(10);
        list.addAtTail(10);
        list.addAtTail(10);
        list.addAtTail(10);
        list.addAtTail(10);
        list.addAtTail(10);


        int val =10;

        MyLinkedListOperations.Node dummy = new MyLinkedListOperations.Node(0);

        dummy.next=list.head;

        MyLinkedListOperations.Node prev = dummy;

        while(prev != null && prev.next!= null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }
            else{
                prev = prev.next;
            }
        }
        MyLinkedListOperations.Node current = dummy.next;


        if (current == null) {
            System.out.println("Empty List");
        } else {

            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
        }
    }
}

//## Why do we use a sentinel (dummy) node with value `0`?
//
//We create this extra node **to handle edge cases easily**, especially when the node to delete is the **head**.
//
//### Without sentinel:
//
//- If `head.val == val`, you must do `head = head.next` and handle separately.
//
//### With sentinel:
//
//- You always delete using `current.next = current.next.next`
//- Works even if the **first node(s)** must be removed
//- Makes code **clean and uniform**
//
//> **The value 0 is not important** — it’s just a placeholder.
//>
//>
//> We never return this `0` node; we return `sentinel.next`.
//>