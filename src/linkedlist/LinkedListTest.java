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

        linkedList.prepend(1);
        linkedList1.prepend(0);
        linkedList.printList();
        linkedList1.printList();

        // removeFirst from linked list which has only one element 1
        LinkedList.Node deletedNode3 = linkedList.removeFirst();
        System.out.println("Element deleted: "  + ((deletedNode3 != null) ? deletedNode3.getValue() : deletedNode3));

        linkedList.getLength();
        // removeFirst from linked list which has no element
        LinkedList.Node deletedNode4 = linkedList.removeFirst();
        System.out.println("Element deleted: "  + ((deletedNode4 != null) ? deletedNode4.getValue() : deletedNode4));

        // removeFirst from linked list which has more one element 1
        LinkedList.Node deletedNode5 = linkedList1.removeFirst();
        System.out.println("Element deleted: "  + ((deletedNode5 != null) ? deletedNode5.getValue() : deletedNode5));

        linkedList1.append(2);
        linkedList1.append(3);
        linkedList.printList();
        linkedList1.printList();

        System.out.println("Element at index: -1 is "  + linkedList.get(-1));
        System.out.println("Element at index: 1 is "  + linkedList.get(1));
        System.out.println("Element at index: 0 is "  + linkedList.get(0));
        LinkedList.Node getNode = linkedList1.get(0);
        LinkedList.Node getNode1 = linkedList1.get(1);
        System.out.println("Element at index: 0 is "  + ((getNode != null) ? getNode.getValue() : getNode));
        System.out.println("Element at index: 1 is "  + ((getNode1 != null) ? getNode1.getValue() : getNode1));

        System.out.println("Set Element at index: -1 status " + linkedList1.set(-1, -1));
        System.out.println("Set Element at index: 0 status " + linkedList1.set(0, 10));
        System.out.println("Set Element at index: 1 status " + linkedList1.set(1, 20));
        System.out.println("Set Element at index: 2 status " + linkedList1.set(2, 30));
        // greater than array length - so will not update
        System.out.println("Set Element at index: 2 status " + linkedList1.set(3, 40));

        linkedList1.printList();
        System.out.println("Insert at position - beginning of the list" + linkedList1.insert(0, 40));
        System.out.println("Insert at position - end of the list " + linkedList1.insert(4, 50));
        System.out.println("Insert at position - in the middle" + linkedList1.insert(3, 60));
        System.out.println("Insert at position - in the middle" + linkedList1.insert(10, 60));
        linkedList1.printList();

        System.out.println("Remove at position - beginning of the list " + linkedList1.remove(0).getValue());
        System.out.println("Remove at position - end of the list  " + linkedList1.remove(5).getValue());
        linkedList1.printList();
        System.out.println("Remove at position - in the middle " + linkedList1.remove(2).getValue());
        System.out.println("Remove at position - -1 " + linkedList1.remove(-1));
        System.out.println("Remove at position - greater than linked list length" + linkedList1.remove(6));
        linkedList1.printList();

        linkedList1.reverse();
        //Reversed linked list
        linkedList1.printList();

    }
}
