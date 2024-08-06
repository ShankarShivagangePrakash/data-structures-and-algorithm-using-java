package hashtables;

import java.util.ArrayList;

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

    // Accepts String input and generates integer hash value.
    private int hashFunction(String key){

        int hash = 0;
        // we convert String into character array.
        char[] keyChars = key.toCharArray();
        // we iterate through each  character.
        for(int i = 0; i < keyChars.length; i++){
            // get ASCII value of the character.
            int asciiValue = keyChars[i];
            // multiply ascii value by prime number and add with existing hash value and finally modulo with hash table size.
            // modulo is applied because the hash value should not be greater than array size.
            hash = (hash + asciiValue * 23) % size;
        }
        return hash;
    }

    public void set(String key, int value){
        /* Fist pass the key through hash function, whatever the hash value it generates
         At that index of the array we need to insert the element.
         Since we are following `separate chaining` methodology to apply collision. We have to check is there any element present in the location
         If not we can add, else we have to keep moving till the end of that list in the same index ( i mean keep moving towards right in the same array index - end of the list)
         then add. */
        int index = hashFunction(key);
        Node newNode = new Node(key, value);

        if(dataMap[index] == null){
            dataMap[index] = newNode;
        } else{
            // Collision exists
            // keep moving till the end of the list in the same array index. then add the element.
            Node temp = dataMap[index];
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key){
        int index = hashFunction(key);
        // if no element present at the index, element not present = return 0
        if(dataMap[index] == null){
            return 0;
        } else{
            Node temp = dataMap[index];
            // iterate through every element in the list at hash value index.
            while (temp != null){
                // if the key we are searching is found in the list, return value.
                if(temp.key.equalsIgnoreCase(key)){
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        // If we are reaching this point means, we have not found the key in hash table, so return 0
        return 0;
    }

    public ArrayList<String> keys(){
        ArrayList<String> allKeys = new ArrayList<>();

        for(int i = 0; i < dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
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
