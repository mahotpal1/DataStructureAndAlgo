/*
	Reverse The Array
*/

import java.util.*;

class Problem3{
	// Function to reverse the array
	public static ArrayList<Integer> reverse(ArrayList<Integer> arr){
		int start=0, end=arr.size()-1;
		while(start<end){
			int temp = arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end, temp);
			start++;
			end--;
		}
		return arr;
	} 
	public static void printList(ArrayList<Integer> arr){
		for(int i=0; i<arr.size(); i++){
			System.out.print(arr.get(i)+ " ");
		}
	}
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(1, 1, 10)
		);
		System.out.println("After reversing elements are : ");
		printList(reverse(arr));
		return;
	}
}