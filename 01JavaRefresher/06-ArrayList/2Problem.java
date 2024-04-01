/*
	Problem2 : Given two integers A and B as input, return an ArrayList containing first B multiples of A.
*/

import java.util.*;

class Problem1{
	// Function 
	public static ArrayList<Integer> solve(int A, int B){
		ArrayList<Integer> ans_list = new ArrayList<Integer>();
		for(int i=1; i<=B; i++){
			ans_list.add(A*i);
		}
		return ans_list;
	}
	public static void print(ArrayList<Integer> arr){
		System.out.println("Elements are : ");
		for(int i=0; i<arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
		return;
	}
	public static void main(String[] args){
		print(solve(2, 4));
		return;
	}
};