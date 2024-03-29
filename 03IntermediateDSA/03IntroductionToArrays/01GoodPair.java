/*
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j 
and (A[i] + A[j] == B). Check if any good pair exist or not.
*/

import java.util.*;

class Problem1{
	//Function to find good pair
	public static int findGoodPair(ArrayList<Integer> arr, int k){
		for(int i=0; i<arr.size(); i++){
			for(int j=i+1; j<arr.size(); j++){
				if(arr.get(i)+arr.get(j) == k){
					return 1;
				}
			}
		}
		return 0;
	} 
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
		Arrays.asList(1, 2, 3, 4)
		);
		System.out.println("Is arr a good Pair? "+findGoodPair(arr, 7));
		return;
	}
}