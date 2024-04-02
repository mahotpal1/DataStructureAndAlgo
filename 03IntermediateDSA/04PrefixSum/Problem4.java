 /*
	Problem 4 :
	You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
	Each query consists of two integers B[i][0] and B[i][1].
	For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
*/

import java.util.*;

public class Main{
	// Creating array list for prefix sum of even elements.
	public static ArrayList<Integer> createPrefixForEven(ArrayList<Integer> arr){
		ArrayList<Integer> eve_arr = new ArrayList<Integer>();
		int count=0;
		if(arr.get(0)%2 == 0){
			eve_arr.add(++count);
		}else{
		    eve_arr.add(count);
		}
		for(int i=1; i<arr.size(); i++){
			if(arr.get(i)%2 == 0){
				eve_arr.add(++count);
			}else{
				eve_arr.add(count);
			}
		}
		return eve_arr;
	}
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(1, 2, 3, 4, 5)
		);
		ArrayList<List<Integer>> pw = new ArrayList<List<Integer>>();
		
		pw.add(Arrays.asList(0, 2));
		pw.add(Arrays.asList(2, 4));
		pw.add(Arrays.asList(1, 4));
		
		arr = createPrefixForEven(arr);
		for(int i=0; i<pw.size(); i++){
			if(pw.get(i).get(0) == 0){
				System.out.print(arr.get(pw.get(i).get(1)) + " ");
			}else{
				System.out.print(arr.get(pw.get(i).get(1))-arr.get(pw.get(i).get(0)-1) + " ");
			}
		}
		return;
	}
}