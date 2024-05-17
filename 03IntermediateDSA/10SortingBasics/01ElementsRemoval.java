/*
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.
 */

import java.util.*;

class Main{
    public static int solve(ArrayList<Integer> arr){
        Collections.sort(arr, Collections.reverseOrder());
        int ans=0;
        for(int i=0; i<arr.size(); i++){
            // Element at i contributes i+1 times to total sum. See notes for explaination
            ans += (i+1)*arr.get(i);
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(2, 1)
        );
        System.out.println("The total cost for given array is : "+solve(arr));
        return;
    }
}