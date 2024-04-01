/*
	Problem4 : 	4. Given an integer N as input, return the numeric staircase.
*/

import java.util.*;

class Problem1{
	// Function to print staircase
	public static ArrayList<List<Integer>> solve(int N){
		ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
		for(int i=1; i<=N; i++){
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=1; j<=i; j++){
				a.add(j);
			}
			arr.add(a);
		}
		return arr;
	}
	public static void print(ArrayList<List<Integer>> arr){
		System.out.println("Elements Are : ");
		for(List<Integer> x: arr){
			for(int c : x){
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		print(solve(4));
		return;
	}
};