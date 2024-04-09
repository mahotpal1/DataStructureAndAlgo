/*
    You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
    But the sum must not exceed B.
*/

import java.util.*;

public class Main
{
    public static int MaximumSubarrayEasy(ArrayList<Integer> arr, int b){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.size(); i++){
            int sum=0;
            for(int j=i; j<arr.size(); j++){
                sum += arr.get(j);
                if(sum > max && sum<=b){
                    max = sum;
                }
            }
        }
        return max;
    }
    
	public static void main(String[] args) {
	    ArrayList<Integer> arr = new ArrayList<Integer>(
	        Arrays.asList(2, 1, 3, 4, 5)    
	    );
	    System.out.println("Maximum Subarray is : " + MaximumSubarrayEasy(arr, 12));
	    return;
	}
}
