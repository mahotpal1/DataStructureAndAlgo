/*
	Given an integer array A of size N and an integer B, you have to return the 
	same array after rotating it B times towards the right.
*/

import java.util.*;

class Problem4{
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
	// Function to reverse in range
	public static ArrayList<Integer> reverseInRange(int B, int C, ArrayList<Integer> arr){
		int start=B, end=C, temp;
		while(start<end){
			temp = arr.get(start);
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
			Arrays.asList(1, 2, 3, 4)
		);
		// Rotate above list by 2;
		reverse(arr);
		reverseInRange(0, 1, arr);
		reverseInRange(2, arr.size()-1, arr);
		printList(arr);
		return;
	}
}