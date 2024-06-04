package linkedlist;

public class LinkedListTest {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList(5);
        linkedList.printList();

        LinkedList linkedList1 = new LinkedList();
        linkedList1.append(1);
        linkedList1.append(2);
        linkedList1.printList();

        // Delete last element of linked list with only one node
        LinkedList.Node deletedNode = linkedList.deleteLast();
        System.out.println("Element deleted: "  + ((deletedNode != null) ? deletedNode.getValue() : deletedNode));

        // again try to remove last element from the empty linked list.
        LinkedList.Node deletedNode1 = linkedList.deleteLast();
        System.out.println("Element deleted: "  + ((deletedNode1 != null) ? deletedNode1.getValue() : deletedNode1));

        //delete last element of linked list with 2 or more elements
        LinkedList.Node deletedNode2 = linkedList1.deleteLast();
        System.out.println("Element deleted: "  + ((deletedNode2 != null) ? deletedNode2.getValue() : deletedNode2));

    }
}
