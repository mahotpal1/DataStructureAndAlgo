/*
    Given an integer array A, find if an integer p exists in the array such that the number of integers greater than
    p in the array equals p.
 */

import java.util.*;

class NobleInteger{
    public static boolean findNoble(ArrayList<Integer> arr){
        // Sort the array first
        Collections.sort(arr);

        for(int i=0; i<arr.size(); i++){
            // Check for each element whether it is equal to coynt of elements present after that
            if(arr.get(i) == arr.size()-i-1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(
                Arrays.asList(3, 2, 1, 3)
        );

        ArrayList<Integer> arr2 = new ArrayList<Integer>(
                Arrays.asList(1, 1, 3, 3)
        );

        System.out.println("Does Array 1 contains Noble Integer ? " + findNoble(arr1));
        System.out.println("Does Array 2 contains Noble Integer ? " + findNoble(arr2));

        return;
    }
}