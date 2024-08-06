package hashtables;

public class HashTableTest {

    public static void main(String[] args){
        HashTable hashTable  = new HashTable();

        hashTable.printHashTable();

        hashTable.set("nails", 100);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        // print hash table after adding elements to it.
        hashTable.printHashTable();

        System.out.println("Element `nails` present? " + hashTable.get("nails"));
        System.out.println("Element `bomb` present? " + hashTable.get("bomb"));
    }
}
