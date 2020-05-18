package algorithms.stacks;

import algorithms.stacks.exception.LinkedListEmptyException;

public class LinkedListStack {
    /*First node*/
    private Node head;
    /*Nest class to define linkedlist Node*/
    private class Node {
        int value;
        Node next;
    }

    public LinkedListStack(){
        head = null;
    }

    /*Remove value from the beginning of the list for demonstrating behaviour of stack*/

    public int pop() throws LinkedListEmptyException{
        if(head == null) throw new LinkedListEmptyException("head is null");
        int value = head.value;
        head = head.next;
        return value;
    }

    /*Add value to the beginning of the list for demonstrating behaviour of stack*/
    public void push(int value){
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.next = oldHead;
    }

    public static void main(String[] args){
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(20);
        linkedListStack.push(50);
        linkedListStack.push(30);
        linkedListStack.push(120);
        linkedListStack.push(10);
        linkedListStack.push(330);
        System.out.println("Element removed from LinkedList: " + linkedListStack.pop());
        System.out.println("Element removed from LinkedList: " + linkedListStack.pop());
        System.out.println("Element removed from LinkedList: " + linkedListStack.pop());
        linkedListStack.push(1050);
        System.out.println("Element removed from LinkedList: " + linkedListStack.pop());
        printList(linkedListStack.head);

    }

    public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
}
