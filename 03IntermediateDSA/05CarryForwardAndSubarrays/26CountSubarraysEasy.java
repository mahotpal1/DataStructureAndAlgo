/*
    Counting Subarrays 2 : 
    Given an array A of N non-negative numbers and a non-negative number B,
    you need to find the number of subarrays in A with a sum less than B.
    We may assume that there is no overflow.
*/

import java.util.*;

public class Main
{
    public static int CountingSubarraysEasy(ArrayList<Integer> arr, int b){
        int good_subarrays=0;
        for(int i=0; i<arr.size(); i++){
            int sum=0;
            for(int j=i; j<arr.size(); j++){
                sum += arr.get(j);
                if(sum<b){
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
	    System.out.println("Total count of such subarrays with sum less than 10 : "+CountingSubarraysEasy(arr, 10));
	    return;
	}
}
