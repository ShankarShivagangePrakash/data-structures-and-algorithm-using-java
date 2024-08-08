package heap;

public class HeapTest {

    public static void main(String[] args){

        Heap heap = new Heap();
        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);
        heap.printHeap();

        heap.insert(100);
        heap.printHeap();

        heap.insert(75);
        heap.printHeap();

        /* Expected Output
           ------------------
           [99, 72, 61, 58]
           [100, 99, 61, 58, 72]
           [100, 99, 75, 58, 72, 61]
         */

    }
}
