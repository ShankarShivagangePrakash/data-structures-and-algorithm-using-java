package hashtables;

public class HashTable {

    // size of the array which represents hash table
    private int size = 7;

    // array of Node type pointers.
    // Whenever we insert key-value pair to hash table, it will create a node and that node will be linked to this array.
    // Because we are following, Separate chaining mechanism for handling collisions.
    private Node[] dataMap;

    public HashTable(){
        dataMap = new Node[size];
    }

    public void printHashTable(){
        for(int i = 0; i < dataMap.length; i++){
            System.out.println("i: " + i);
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println("  { Key: " + temp.key + " value: " + temp.value + " }");
                temp = temp.next;
            }
        }
    }


    class Node{

        private String key;
        private int value;
        private Node next;

        public Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
}
