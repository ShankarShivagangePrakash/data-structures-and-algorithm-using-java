package linkedlist;

public class LinkedListTest {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList(5);
        linkedList.printList();

        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(2);
        linkedList1.printList();
    }
}
