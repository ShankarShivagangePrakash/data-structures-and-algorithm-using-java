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

    }
}
