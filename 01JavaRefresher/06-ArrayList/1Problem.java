/*
	Problem1 : Given a arrayList as input return a arrayList containing the multiples of 7.
*/

import java.util.*;

class Problem1{
	// Function takes input as arraylist and returns arraylist of multiples of 7 or 5.
	public static ArrayList<Integer> solve(ArrayList<Integer> arr){
		ArrayList<Integer> ans_list = new ArrayList<Integer>();
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i)%7 == 0 || arr.get(i)%5 == 0){
				ans_list.add(arr.get(i));
			}
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
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(1, 5, 3, 7, 0)
		);
		print(solve(arr));
		return;
	}
};