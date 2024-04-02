/*
	Given an array A of N integers. 
	Construct prefix sum of the array in the given array itself.
*/

import java.util.*;

public class Main{	
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5};
		for(int i=1; i<5; i++){
			arr[i] += arr[i-1];
		}
		
		for(int i=0; i<5; i++){
			System.out.println(arr[i]+" ");
		}
		return;
	}
}