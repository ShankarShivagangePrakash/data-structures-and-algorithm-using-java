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

    public LinkedList.Node removeFirst(){
        // empty list return null
        if(length == 0) return null;

        // assign temp = head
        // head = head.next; -- next element becomes the head
        // return head;

        LinkedList.Node temp = head;
        head = head.next;
        length--;

        // if there was only one element in the list,
        // after removal head will be null, we need to point tail to null as well, since the list is empty.
        if(length == 0) tail = head;

        return temp;
    }

    public Node get(int index){
        // for negative index or for index greater than or equal to size of linked list return null
        // Note: index starts from zero - just like arrays.
        if(index < 0 || (index >= length)){
            return null;
        }

        Node temp = head;
        // iterate index number of times, to get element at index position.
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return  temp;

    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || (index > length)){
            return false;
        }
        //Insert at the beginning
        if(index == 0){
            prepend(value);
            return true;
        }

        // Insert to the end of the list.
        if(index == length){
            append(value);
            return true;
        }

        // Insert in the middle
        Node node = new Node(value);
        // get the node before the specified index, create link between previousNode, newNode and nextNode.
        Node temp = get(index - 1);
        node.next = temp.next;
        temp.next = node;
        length++;
        return true;
    }

    public LinkedList.Node remove(int index){

        if(index < 0 || index > length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length){
            return deleteLast();
        }

        LinkedList.Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
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
