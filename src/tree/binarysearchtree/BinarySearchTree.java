package tree.binarysearchtree;

public class BinarySearchTree {

    Node root;

    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return  true;
        }

        Node temp = root;
        // we don't know, till what point we need to move to find where the node has to be inserted, so while loop.
        while(true){

            // Do not allow to insert duplicate, return false.
            if(temp.value == newNode.value){
                return false;
            }

            // If the value of new node is less than the current node, then move to left subtree
            // else move right
            if(newNode.value < temp.value){
                // new node value is less than the current node, and it's left child is empty, you can insert the new node there.
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                // If that is not the case, you have to keep moving in the left subtree
                temp = temp.left;
            }
            // same logic, but for right subtree.
            else{
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    class Node{
        private int value;
        private Node left;
        private Node right;

        Node(int value){
            this.value = value;
            left = right = null;
        }

        public int getValue(){
            return  value;
        }
    }
}
