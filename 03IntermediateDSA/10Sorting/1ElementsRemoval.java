/*
    Given an integer array A of size N. You can remove any element from the array in one operation.
    The cost of this operation is the sum of all elements in the array present before this operation.

    Find the minimum cost to remove all elements from the array.
 */

import java.util.*;

class ElementsRemoval{
    public static int remove(ArrayList<Integer> arr){
        int ans = 0;

        Collections.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.size(); i++){
            ans += (i+1)*arr.get(i);
        }
        return ans;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(2, 1)
        );
        System.out.println("Minimum cost to remove = " + remove(arr));

        return;
    }
}