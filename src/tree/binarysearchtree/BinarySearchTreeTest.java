package tree.binarysearchtree;

public class BinarySearchTreeTest {

    public static void main(String[] args){
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        System.out.println(" Binary Search tree root node: " + binarySearchTree.root);

        binarySearchTree.insert(47);
        binarySearchTree.insert(21);
        binarySearchTree.insert(76);
        binarySearchTree.insert(18);
        binarySearchTree.insert(52);
        binarySearchTree.insert(82);

        System.out.println(" Binary Search tree root node after insert(): " + binarySearchTree.root.getValue());

        System.out.println(" Binary Search tree contains 47? " + binarySearchTree.contains(47));
        System.out.println(" Binary Search tree contains 76? " + binarySearchTree.contains(76));
        System.out.println(" Binary Search tree contains 18? " + binarySearchTree.contains(18));
        System.out.println(" Binary Search tree contains 52? " + binarySearchTree.contains(52));
        System.out.println(" Binary Search tree contains 82? " + binarySearchTree.contains(82));
        System.out.println(" Binary Search tree contains 21? " + binarySearchTree.contains(21));
        // Not present in the tree, expecting false.
        System.out.println(" Binary Search tree contains 25? " + binarySearchTree.contains(25));

    }
}
