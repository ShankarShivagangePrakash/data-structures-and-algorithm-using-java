package doublylinkedlist;

public class DoublyLinkedListTest {

    public static void main(String[] args){

        DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList(1);
        doublyLinkedList1.getHead();
        doublyLinkedList1.getTail();
        doublyLinkedList1.getLength();
        doublyLinkedList1.printList();

        DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
        doublyLinkedList2.append(1);
        doublyLinkedList2.append(2);
        doublyLinkedList2.append(3);
        doublyLinkedList2.getLength();
        doublyLinkedList2.printList();
    }
}
