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

    public Node deleteLast(){
        // If linked list length is zero, we cannot delete any element, return null.
        // alternatively, you can achieve the same thing using if (head == null && tail == null)
        if(length == 0) return  null;

        Node pre = head;
        Node temp = head;

        // keep assigning current node reference to pre and move temp node to next node.
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        /* Once temp node reaches to the end of the list,
         pre will be pointing to last but one element in the list,
         assign pre to tail.
         pre.next to null - since now it acts as a last element in the list and reduce the count: length--.*/
        tail = pre;
        pre.next = null;
        length--;

        /* corner case.
         when list has only one element above while loop doesn't execute and
         tail, head, pre, temp all will be pointing to first element in the list
         but length will be decremented and will be zero.
         In such scenario, we need to set head and tail to null to clean the linkedList */
        if(length == 0){
            head = null;
            tail = null;
        }

        //Return the deleted node.
        return  temp;

    }

    public void prepend(int value){

        Node node = new Node(value);

        // For empty linked list, new node will become head and tail
        if(length == 0){
            head = node;
            tail = node;
        } else{
            // assign first element to newNode.next
            node.next = head;
            head = node;
        }
        length++;
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

        public int getValue(){
            return this.value;
        }
    }

}
