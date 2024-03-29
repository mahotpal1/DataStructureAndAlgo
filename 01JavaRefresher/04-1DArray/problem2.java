import java.util.*;

class Problem2{
	// Function to print sum off array elements 
	public static int calcSum(int[] arr, int n){
		int sum = 0;
		for(int i=0; i<n; i++){
			sum += arr[i];
		}
		return sum;
	} 
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(calcSum(arr, 10));
		return;
	}
}