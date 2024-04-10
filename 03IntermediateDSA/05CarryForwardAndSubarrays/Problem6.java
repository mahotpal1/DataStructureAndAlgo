/*
	Problem 6 : Even Sub Arrays
*/

import java.util.*;

class Problem6{
	// Function to track all possible substrings
	public static String check(ArrayList<Integer> A){
		if(A.size()%2 != 0 || A.get(0)%2 != 0 || A.get(A.size()-1)%2!=0){
			return "NO";
		}
		return "YES";
	}
	
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(2, 4, 8, 6)
		);
		System.out.println("Is Possible : "+check(arr));
		return;
	}
}