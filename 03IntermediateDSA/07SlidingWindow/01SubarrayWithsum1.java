/*
    	1. Given an array A of length N. Also given are integers B and C.
           Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 */

import java.util.*;

class SubarraySum{
    // Function to check and return presence of array
    public static int checkPresence(ArrayList<Integer> arr, int B, int C){
        int sum = 0;
        for(int i=0; i<B; i++){
            sum += arr.get(i);
        }
        if(sum == C){
            return 1;
        }
        int track_j=0;
        for(int i=B; i<arr.size(); i++){
            sum -= arr.get(track_j);
            sum += arr.get(i);
            if(sum == C){
                return 1;
            }
        }
        return 0;
    }

    // Main function
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(
                Arrays.asList(4, 3, 2, 6, 1)
        );
        System.out.println("Is possible for above array for window 3 and sum 11 : " + checkPresence(arr1, 3, 11));

        ArrayList<Integer> arr2 = new ArrayList<Integer>(
                Arrays.asList(4, 2, 2, 5, 1)
        );
        System.out.println("Is possible for above array for window 4 and sum 6 : " + checkPresence(arr2, 4, 6));
        return;
    }
}