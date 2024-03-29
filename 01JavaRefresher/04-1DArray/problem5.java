import java.util.*;

class Problem5{
	// Function to check whether present or not
	public static boolean solve(int[] arr, int n, int x){
		for(int i=0; i<n; i++){
			if(arr[i] == x){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Is 2 present in array? "+(solve(arr, 5, 2)?"Yes":"NO"));
		System.out.println("Is -1 present in array? "+(solve(arr, -1, 2)?"Yes":"NO"));
		return;
	}
}