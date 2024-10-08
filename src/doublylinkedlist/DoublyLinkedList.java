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

    public void prepend(int value){
        Node node = new Node(value);

        if(length == 0){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    public Node deleteLast(){
        if(length == 0) return null;

        Node temp = tail;

        if(length == 1){
            // in this case head and tail has to be reset.
            head = null;
            tail = null;
        } else{
            // remove link from last but one node to last node from both the nodes.
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;

        return temp;
    }

    public Node deleteFirst(){
        if(length == 0) return null;

        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
        } else{
            head = temp.next;
            temp.next = null;
            head.prev = null;
        }
        length--;

        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = null;
        if(index < length/2){
            temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node node = get(index);

        if(node != null){
            node.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }

        if(index == 0){
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node node = new Node(value);
        // Have before and after node.
        Node before = get(index - 1);
        Node after = before.next;

        // link before to new node and new node to after node.
        node.prev = before;
        before.next = node;
        node.next = after;
        after.prev = node;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }

        if(index == 0){
            return deleteFirst();
        }
        if(index == length - 1){
            return  deleteLast();
        }

        Node temp = get(index);

        Node before = temp.prev;
        Node after = temp.next;
        before.next = after;
        after.prev = before;
        temp.prev = null;
        temp.next = null;
        length--;

        return temp;
    }
}
