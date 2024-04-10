/*
	Problem1 : 	1. Given an integer array A containing N distinct integers, you have to find all the leaders in array A. 
				   An element is a leader if it is strictly greater than all the elements to its right side.
				   NOTE: The rightmost element is always a leader.
*/
import java.util.*;
class Problem1{
	public static ArrayList<Integer> returnLeaders(ArrayList<Integer> arr){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int max = arr.get(arr.size()-1);
		ans.add(max);
		for(int i=arr.size()-1; i>=0; i--){
			if(arr.get(i) > max){
				max = arr.get(i);
				ans.add(max);
			}
		}
		return ans;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(16, 17, 4, 3, 5, 2)
		);
		System.out.println("All leaders in given array are : ");
		for(int x: returnLeaders(arr)){
			System.out.print(x+" ");
		}
		System.out.println();
		return;
	}
}