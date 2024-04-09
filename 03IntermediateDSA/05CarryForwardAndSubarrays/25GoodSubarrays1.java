/*
    Given an array of integers A, a subarray of an array is said to be good if 
    it fulfills any one of the criteria:
    1. Length of the subarray is be even, and the sum of all the elements of the
       subarray must be less than B.
    2. Length of the subarray is be odd, and the sum of all the elements of the 
       subarray must be greater than B.
    Your task is to find the count of good subarrays in A.
*/

import java.util.*;

public class Main
{
    public static int GoodSubarrays1(ArrayList<Integer> arr, int b){
        int good_subarrays=0;
        for(int i=0; i<arr.size(); i++){
            int sum=0, count=0;
            for(int j=i; j<arr.size(); j++){
                sum += arr.get(j);
                count++;
                if((count%2 == 0 && sum<b) || (count%2 != 0 && sum>b)){
                    good_subarrays++;
                }
            }
        }
        return good_subarrays;
    }
    
	public static void main(String[] args) {
	    ArrayList<Integer> arr = new ArrayList<Integer>(
	        Arrays.asList(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9)    
	    );
	    System.out.println("Total count of good subarrays : "+GoodSubarrays1(arr, 65));
	    return;
	}
}