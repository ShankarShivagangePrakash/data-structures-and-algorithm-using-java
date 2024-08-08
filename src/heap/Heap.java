package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    private List<Integer> heap;

    public Heap(){
        this.heap = new ArrayList<Integer>();
    }

    public void printHeap(){
        System.out.println(heap);
    }

    private int leftChild(int index){
        return (2 * index) + 1;
    }

    private int rightChild(int index){
        return (2 * index) + 2;
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    // To swap values of two specified indexes in array list.
    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
        // we add the element at the end of array list, means you are filling the heap in complete binary tree fashion.
        heap.add(value);

        // heap.size() - gives number of elements int the arrayList
        // -1 means, points to last element in the array list.
        int current = heap.size() - 1;

        /* Now we need to keep swapping current element and its parent
         either until we reach the top node - current node is not greater than 0
         ( it will be equal to 0 - array index )
         in heap top element in the heap equivalent to first element in the array list, so 0th index element
         if the current index not greater than 0, stop.
         the other case it should stop is, when current element is not greater than it's parent */
        while(current > 0 && heap.get(current) > heap.get(parent(current))){
            // once you swap current element with its parent by passing index of current and its parent
            swap(current, parent(current));
            // Now current has to be set parent, Now from this location we need to compare it with its parent.
            // again same while loop executes.
            current = parent(current);
        }



    }


}
