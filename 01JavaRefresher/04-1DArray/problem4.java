import java.util.*;

class Problem4{
	// Function to calculate minimum 
	public static int calcMin(int[] arr, int n){
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args){
		int[] arr = {5, 3, 2,-1, 23, 12};
		System.out.println("Minimum value in array is : "+calcMin(arr, 6));
		return;
	}
}