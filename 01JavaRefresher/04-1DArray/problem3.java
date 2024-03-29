import java.util.*;

class Problem3{
	//Function to calculate maximum
	public static int calcMax(int[] arr, int n){
		int max_ele = Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			if(arr[i]>max_ele){
				max_ele = arr[i];
			}
		}
		return max_ele;
	}
	public static void main(String[] args){
		int[] arr = {1, 2, 4, 2, 1, 3};
		System.out.println("Maximum Element int array : "+ calcMax(arr, 5));
		return;
	}
}