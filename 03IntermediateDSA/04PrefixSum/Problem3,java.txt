/*
	Problem 3 : 
	You are given an array A of integers of size N.
	Your task is to find the equilibrium index of the given array
	The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
	If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
	
	Note:
	Array indexing starts from 0.
	If there is no equilibrium index then return -1.
	If there are more than one equilibrium indexes then return the minimum index.
*/

import java.util.*;

public class Main{
	// Function to return the equilibrium index
	public static int returnIndex(ArrayList<Integer> arr, ArrayList<Integer> a){
		for(int i=0; i<arr.size(); i++){
			if(arr.get(arr.size()-1)-arr.get(i) == arr.get(i)-a.get(i)){
				return i;
			}
		}
		return -1;
	}
	// Function to return prefix sum
	public static ArrayList<Integer> createPrefix(ArrayList<Integer> arr){
		ArrayList<Integer> nw = new ArrayList<Integer>();
		nw.add(arr.get(0));
		for(int i=1; i<arr.size(); i++){
			nw.add(arr.get(i)+nw.get(i-1));
		}
		return nw;
	}
	// Function to print array elements 
	public static void print(ArrayList<Integer> arr){
		for(int i=0; i<arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
	}
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(-7, 1, 5, 2, -4, 3, 0)
		);
		System.out.print("Index is : "+returnIndex(createPrefix(arr), arr));
		return;
	}
} 