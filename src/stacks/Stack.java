package stacks;

public class Stack {

    // since stack will have reference to only top element in the stack
    // we can have only head, just for naming conventions, renaming head to top.
    private Node head;
    // length naming convention changed to height in stacks.
    private int height;

    Stack(){
        this.head = null;
        this.height = 0;
    }

    Stack(int value){
        Node node = new Node(value);
        head = node;
        height = 1;
    }

    public void push(int value){
        Node node = new Node(value);
        if(height == 0){
           head = node;
        }else{
            node.next = head;
            head = node;
        }
        height++;
    }

    public Node pop(){
        if(height == 0) return null;

        Node temp = head;
        head = temp.next;
        height--;
        return temp;
    }

    public Node peek(){
        return head;
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

    public void getHeight(){
        System.out.println("Height of the stack is " + height);
    }

    public void printStack(){
        Node temp = head;
        while(temp != null){
            System.out.print("--> " + temp.value);
            temp = temp.next;
        }
        System.out.println("\n");
    }

}
