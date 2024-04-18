/*
    Given an array A of size N, find the subarray of size B with the least average.
 */

import java.util.*;

class SubarrayWithLeastAverage {
    public static int solve(ArrayList<Integer> A, int B) {
        int s=1, e=B;
        float sum = 0;
        for(int i=0; i<B; i++){
            sum += A.get(i);
        }
        int result = s-1;
        float ans = sum/A.size();
        while(e < A.size()){
            sum = (sum - A.get(s-1) + A.get(e));
            if((sum/A.size()) < ans){
                ans = sum/A.size();
                result=s;
            }
            s++; e++;
        }
        return result;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(3, 7, 90, 20, 10, 50, 40)
        );
        System.out.println("Return the starting index = "+solve(arr, 3));
        return;
    }
}