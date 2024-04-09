/*
    You are given an array A of N integers.
    Return a 2D array consisting of all the subarrays of the array

    Note : The order of the subarrays in the resulting 2D array does not matter.
*/

import java.util.*;

public class Main
{
    public static ArrayList<ArrayList<Integer>> allSubarraySum(ArrayList<Integer> arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<arr.size(); i++){
            for(int j=i; j<arr.size(); j++){
                ArrayList<Integer> a = new ArrayList<Integer>();
                for(int k=i; k<=j; k++){
                    a.add(arr.get(k));
                }
                ans.add(a);
            }
        }
        return ans;
    }
    
	public static void main(String[] args) {
	    ArrayList<Integer> arr = new ArrayList<Integer>(
	        Arrays.asList(1, 2, 3)    
	    );
	    for(ArrayList<Integer> x : allSubarraySum(arr)){
	        for(int y : x){
	            System.out.print(y+" ");
	        }
	        System.out.println();
	    }
	    return;
	}
}