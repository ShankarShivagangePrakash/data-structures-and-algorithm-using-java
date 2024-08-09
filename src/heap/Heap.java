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

    // Remove method of heap, will always remove top element
    // we cannot delete any other element of our choice,
    // so we don't need to pass any index as arguments to this method.
    public Integer remove(){
        // If heap is empty, then return null. We don't have anything to delete.
        if(heap.size() == 0){
            return null;
        }
        // If heap has only one element, remove that element from the arrayList and return
        if(heap.size() == 1){
            return heap.remove(0);
        }

        // If heap has two or more elements, below section will be executed
        // store the top element in a temp variable, which we are going to return from this method
        int maxValue = heap.get(0);
        // Now replace top element with the right most leaf element of the heap
        // or in other words, replace array[0] with array[last element]
        heap.set(0, heap.remove(heap.size() - 1));
        // After you moved last element to top of the heap, now you have restructured to maintain min heap or max heap property.
        // That will be done using sinkDown()
        sinkDown(0);

        return maxValue;
    }

    private void sinkDown(int index){
        // maxIndex points to location which is greatest of current element and its children
        // initially we assign maxIndex same as index. In this case both maxIndex and index will be 0
        int maxIndex = index;

        while (true){
            // we get left and right children index.
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            /* If left child value is greater than the value at maxIndex, then we set leftIndex as maxIndex
             similarly, if right child is greater than the value at the maxIndex, then maxIndex will be rightIndex.
             But note, for last elements in the array,
             children won't exist, but leftChild() and rightChild() methods might still return some index value which doesn't exist
             So we perform this check, if leftIndex or right Index really exists in the heap
             that is leftIndex < heap.size()  or rightIndex < heap.size() - then only perform comparison*/
            if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)){
                maxIndex = leftIndex;
            }
            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }

            // If maxIndex has updated means, it has found index of its children which is greater that parent
            // In such case, we have to swap parent and child (child at the index of maxIndex)
            if(maxIndex != index){
                swap(index, maxIndex);
                /* After swapping parent and child, now control should move to child location
                 again we should continue that comparison with its child
                 so set index = maxIndex*/
                index = maxIndex;
            } else{
                // If maxIndex is equal to Index means, it has not found any child having value greater than it
                // so stop restructuring heap and return control.
                return;
            }
        }
    }

}
