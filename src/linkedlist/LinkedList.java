package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    // LinkedList constructor will be called only when linkedList is created for the very first time.
    public LinkedList(int value){

        // create node.
        Node node = new Node(value);

        //for the very first element, head and tail will point to same memory location, i.e first element.
        this.head = node;
        this.tail = node;
        length = 1;
    }

    public void printList(){
        /* we assign the head reference to a temp variable
         keep moving till we reach end of the linkedList,
         means till temp = null */
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            // move to next element
            temp = temp.next;
        }
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
