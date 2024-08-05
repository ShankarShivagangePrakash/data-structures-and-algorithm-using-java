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

    public boolean contains(int value){
        Node temp = root;
        while (temp != null) {
            // If search node value is less than current node, move to left subtree.
            if (value < temp.value){
                temp = temp.left;
            }
            // If search node value is greater than current node, move to right subtree.
            else if (value > temp.value){
                temp = temp.right;
            }
            // this case refers to search node value is equal to current node value, found - so return true.
            else{
                return true;
            }
        }
        // if we come out of while loop means, we have not found the element, so return false.
        // This will handle, if the tree is empty. In that case while loop will not execute - so it will execute next line and returns false.
        return false;
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
