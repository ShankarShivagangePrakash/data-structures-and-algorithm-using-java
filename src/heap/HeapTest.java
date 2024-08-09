package heap;

public class HeapTest {

    public static void main(String[] args){

        /*Heap heap = new Heap();
        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);
        heap.printHeap();

        heap.insert(100);
        heap.printHeap();

        heap.insert(75);
        heap.printHeap();

        *//* Expected Output
           ------------------
           [99, 72, 61, 58]
           [100, 99, 61, 58, 72]
           [100, 99, 75, 58, 72, 61]
         *//*
        */

        Heap heap = new Heap();
        heap.insert(95);
        heap.insert(75);
        heap.insert(80);
        heap.insert(55);
        heap.insert(60);
        heap.insert(50);
        heap.insert(65);
        heap.printHeap();

        heap.remove();
        heap.printHeap();

        heap.remove();
        heap.printHeap();

        /*
            Expected Output:
            [95, 75, 80, 55, 60, 50, 65]
            [80, 75, 65, 55, 60, 50]
            [75, 60, 65, 55, 50]
         */


    }
}
