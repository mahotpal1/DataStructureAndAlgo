import java.util.*;

class Problem7{
	// Function to return count of each element 
	public static int countK(int[] arr, int n, int k){
		int count=0;
		for(int i=0; i<n; i++){
			if(arr[i] == k){
				count++;
			}
		}
		return count;
	}
	// Function to preturn frequency count
	public static void returnFrequency(int[] arr, int n){
		int[] ans = new int[n];
		for(int i=0; i<n; i++){
		System.out.print(countK(arr, n, arr[i]) + " ");
		}
		return;
	}
	public static void main(String[] args){
		int[] arr = {1, 1, 4, 2, 1, 5, 3, 4};
		returnFrequency(arr, 8);
		return;
	}
}