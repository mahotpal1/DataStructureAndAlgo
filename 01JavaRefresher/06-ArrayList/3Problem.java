/*
	Problem3 : Given a 2D Arraylist as input, print it line by line.
*/

import java.util.*;

class Problem1{
	// Function to print arrayList
	public static void solve(ArrayList<List<Integer>> arr){
		System.out.println("Elements are : ");
		for(List<Integer> a : arr){
			System.out.print("\t    ");
			for(int x: a){
				System.out.print(x + " ");
			}
			System.out.println();
		}
		return;
	}
	public static void main(String[] args){
		ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
		arr.add(Arrays.asList(1, 2, 3));
		arr.add(Arrays.asList(4, 5, 6));
		arr.add(Arrays.asList(7, 8, 9));
		solve(arr);
		return;
	}
};