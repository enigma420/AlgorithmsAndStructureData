package algorithms.queues;

public class QueueUsingLinkedList {
private Node front,rear;
private int currentSize; // number of items

    /*Class to define linked node*/
    private class Node{
        int data;
        Node next;
    }

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
        currentSize = 0;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    /*Remove item from the beginning of the list*/
    public int dequeue(){
        int data = front.data;
        front = front.next;
        if(isEmpty()) rear = null;
        currentSize--;
        System.out.println(data+ " removed from the queue");
        return data;
    }

    /*Add data to the end of the list*/
    public void enqueue(int data){
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if(isEmpty()) front = rear;
        else oldRear.next = rear;
        currentSize++;
        System.out.println(data+ " added to the queue");
    }

    public static void main(String[] args){
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(8);
        queue.enqueue(33);
        queue.dequeue();
        queue.enqueue(13);
        queue.enqueue(132);
        queue.dequeue();
        queue.enqueue(111);
        queue.dequeue();
    }
}
