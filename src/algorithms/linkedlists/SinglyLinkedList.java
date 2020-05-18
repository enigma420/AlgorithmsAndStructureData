package algorithms.linkedlists;

class Node{
    int data;
    Node next;

    public void displayNodeData(){
        System.out.println("{ " + data + "} ");
    }
}

public class SinglyLinkedList {
    private Node head;




    public boolean isEmpty(){
        return head == null;
    }

    /*Used to insert a node at the start of linkedlist*/
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    /*Used to delete node from start of linkedlist*/
    public Node deleteFirst(){
        Node temp = head;
        head = head.next;
        return temp;
    }

    /*Use to delete node after particular node*/
    public void deleteAfter(Node after){
        Node temp = head;
        while(temp.next != null && temp.data != after.data){
            temp = temp.next;
        }
        if(temp.next != null) temp.next = temp.next.next;
    }

    /*Used to insert a node at the start of linkedlist*/
    public void insertLast(int data){
        Node current = head;
        while(current.next != null) current = current.next;
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    /*For printing LinkedList*/
    public void printLinkedList(){
        System.out.println("Print linkedlist (head --> last) ");
        Node current = head;
        while(current != null){
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertFirst(8);
        linkedList.insertFirst(3);
        linkedList.insertFirst(6);
        linkedList.insertFirst(1);
        linkedList.insertLast(2);
        /*Linked list will be (2 -> 1 -> 6 -> 3 -> 8) */
        Node node = new Node();
        node.data = 1;
        linkedList.deleteAfter(node);
        /*After deleting node after 1, Linkedlist will be (2 -> 1 -> 3 -> 8) */
        linkedList.printLinkedList();
    }
}
