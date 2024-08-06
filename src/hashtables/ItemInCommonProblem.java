package hashtables;

import java.util.HashMap;

/* Problem Statement:
- we will have two arrays, out of which one element will be common
Eg: array 1 - [1, 3, 5]
    array 2 - [2, 4, 5]
       our algorithm has to return 5 which is common in both the arrays.

    If we follow brute force approach - it will be O(n^2)
        for( int i : array1){
            for(int j: array2){
                if ( i == j)
                    return true;

            }
        }

    But is there a better approach - yes using hashMap which is hash table only
    We can achieve the same thing with O(n)

    Approach
    - We create a hashmap of key as array element data type - in this case Integer and value is Boolean object
    - we first iterate through every element in the first array and add those elements to hashmap with value as true.
    - then we iterate through every element of the second array in different loop.
        For every element we check is that element present in the hashMap
        If present it means that is the common element
        If you don't find even after iterating all the elements in the second array
        It means there is no common element return false.


 */
public class ItemInCommonProblem {

    public static boolean itemInCommon(int[] array1, int[] array2){

        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for( int i : array1){
            hashMap.put(i, true);
        }

        for (int i: array2){
            if(hashMap.get(i) != null)
                return true;
        }
        return false;
    }

    public static void main(String[] args){

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        System.out.println("Element common in both the arrays is " + ItemInCommonProblem.itemInCommon(array1, array2));
    }
}
