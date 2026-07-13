package LinkedList;

class Node{

    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next=null;
    }
}

public class LinkedListCreation {


    public static void main(String[] args){

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        Node head = node1;
        node1.next = node2;
        node2.next= node3;

        Node current = head;
        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }



    }
}
