package queue;

public class Queue {

    private Node first; // represents head
    private Node last; // represents tail
    private int length;

    Queue(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    Queue(int value){
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;
    }

    // represents append() of the linked list.
    public void enqueue(int value){
        Node node = new Node(value);

        if(length == 0){
            first = node;
            last = node;
        }else{
            last.next = node;
            last = node;
        }
        length++;
    }

    // represents removeFirst() of linked list.
    public Node dequeue(){
        if(length == 0) return null;

        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        } else{
            first = first.next;
        }
        length--;

        return temp;

    }

    class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

    public void getLength(){
        System.out.println("Length of the Queue is " + length);
    }

    public void printQueue(){
        Node temp = first;

        while(temp != null){
            System.out.print("--> " + temp.value);
            temp = temp.next;
        }
        System.out.println("\n");
    }
}
