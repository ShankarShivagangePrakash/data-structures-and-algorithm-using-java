package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    // create empty linked list
    public LinkedList(){
        head = tail = null;
        length = 0;
    }

    // LinkedList constructor will be called only when linkedList is created for the very first time.
    public LinkedList(int value){

        // create node.
        Node node = new Node(value);

        //for the very first element, head and tail will point to same memory location, i.e first element.
        this.head = node;
        this.tail = node;
        length = 1;
    }

    public void append(int value){
        Node node = new Node(value);
        // both head and tail null means linked list is empty
        // alternatively we can check for length == 0 for empty linked list scenario.
        if (head == null && tail == null) {
            // If linked list is empty and current element is the first element
            // assign both head and tail to current element.
            head = node;
            tail = node;
            length = 1;
        } else{
            // assign tail.next to new Node so last element in the list points to the new node.
            tail.next = node;
            // point tail to new Node.
            tail = node;
            length++;
        }
    }

    public void getHead(){
        System.out.println("head of the linkedList: " + head);
    }

    public void getTail(){
        System.out.println("Tail of the linked list: " + tail);
    }

    public void getLength(){
        System.out.println("Length of the linked list: " + length);
    }


    public void printList(){
        /* we assign the head reference to a temp variable
         keep moving till we reach end of the linkedList,
         means till temp = null */
        Node temp = head;
        while (temp != null){
            System.out.print("-->" + temp.value);
            // move to next element
            temp = temp.next;
        }
        System.out.println("\n");
    }

    // Inner class
    class Node {
        // Holds value
        private int value;
        // points to next node in the linked list,
        // stores its reference that's why data type is of class, so it will store reference.
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

}
