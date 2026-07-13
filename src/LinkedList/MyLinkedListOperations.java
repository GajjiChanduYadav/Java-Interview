package LinkedList;

public class MyLinkedListOperations {

    class Node{
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

    }
    Node head;
    int size;

    MyLinkedListOperations(){
          head = null;
          size =0;
    }
    public void addAtHead(int val){
        Node newNode = new Node(val);

        newNode.next=head;
        head = newNode;
        size++;
    }

    public void addAtTail(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;

            while(current.next != null){
                current=current.next;
            }
            current.next=newNode;
        }
        size++;

    }

    public void printList(){
        Node current = head;
        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }
    }
    public static void main(String[] args){
                MyLinkedListOperations list = new MyLinkedListOperations();
                // Creates a new empty linked list object

        list.addAtHead(30);
        list.addAtHead(20);
        list.addAtHead(10);

        list.printList();   // 10 20 30




    }


}
