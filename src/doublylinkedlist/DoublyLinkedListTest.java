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

        DoublyLinkedList.Node deletedNode1 = doublyLinkedList2.deleteLast();
        DoublyLinkedList.Node deletedNode2 = doublyLinkedList2.deleteLast();
        DoublyLinkedList.Node deletedNode3 = doublyLinkedList2.deleteLast();
        DoublyLinkedList.Node deletedNode4 = doublyLinkedList2.deleteLast();
        System.out.println("Deleted element is: " + (deletedNode1 != null ? deletedNode1.getValue() : null));
        System.out.println("Deleted element is: " + (deletedNode2 != null ? deletedNode2.getValue() : null));
        System.out.println("Deleted element is: " + (deletedNode3 != null ? deletedNode3.getValue() : null));
        System.out.println("Deleted element is: " + (deletedNode4 != null ? deletedNode4.getValue() : null));
        doublyLinkedList2.getLength();
        doublyLinkedList2.printList();

        DoublyLinkedList doublyLinkedList3 = new DoublyLinkedList();
        doublyLinkedList3.prepend(1);
        doublyLinkedList3.prepend(2);
        doublyLinkedList3.prepend(3);
        doublyLinkedList3.prepend(4);
        doublyLinkedList3.getLength();
        doublyLinkedList3.printList();

        DoublyLinkedList.Node deletedNode5 = doublyLinkedList3.deleteFirst();
        DoublyLinkedList.Node deletedNode6 = doublyLinkedList3.deleteFirst();
        DoublyLinkedList.Node deletedNode7 = doublyLinkedList3.deleteFirst();
        DoublyLinkedList.Node deletedNode8 = doublyLinkedList3.deleteFirst();
        DoublyLinkedList.Node deletedNode9 = doublyLinkedList3.deleteFirst();
        System.out.println("Deleted element is: " + (deletedNode5 != null ? deletedNode5.getValue() : null));
        System.out.println("Deleted element is: " + (deletedNode6 != null ? deletedNode6.getValue() : null));
        System.out.println("Deleted element is: " + (deletedNode7 != null ? deletedNode7.getValue() : null));
        System.out.println("Deleted element is: " + (deletedNode8 != null ? deletedNode8.getValue() : null));
        System.out.println("Deleted element is: " + (deletedNode9 != null ? deletedNode9.getValue() : null));
        doublyLinkedList2.getLength();
        doublyLinkedList2.printList();
    }
}
