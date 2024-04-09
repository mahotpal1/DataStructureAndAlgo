/*
    You are given an integer array A of length N.
    You have to find the sum of all subarray sums of A.
    More formally, a subarray is defined as a contiguous part of an array which 
    we can obtain by deleting zero or more elements from either end of the array.
    A subarray sum denotes the sum of all the elements of that subarray.

    Note : Be careful of integer overflow issues while calculations. 
           Use appropriate datatypes.
*/

import java.util.*;

public class Main
{
    public static int allSubarraySum(ArrayList<Integer> arr){
        int sum = 0;
        for(int i=0; i<arr.size(); i++){
            sum += (i+1)*(arr.size()-i)*arr.get(i);
        }
        return sum;
    }
    
	public static void main(String[] args) {
	    ArrayList<Integer> arr = new ArrayList<Integer>(
	        Arrays.asList(2, 1, 3)    
	    );
	    System.out.println("All Subarray Sum : " + allSubarraySum(arr));
	    return;
	}
}