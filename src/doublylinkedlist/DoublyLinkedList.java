package doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    DoublyLinkedList(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    class Node{
        private int value;
        private Node prev;
        private Node next;

        Node(int value){
            this.value = value;
        }

        public void setValue(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
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
        Node temp = head;
        while(temp != null){
            System.out.printf("--> %d", temp.getValue());
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void append(int value){
        Node node = new Node(value);

        // For empty linked list.
        if(length == 0){
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        length++;
    }


}
