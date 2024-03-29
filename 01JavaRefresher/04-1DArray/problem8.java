import java.util.*;

class Problem8{
	//Function to check whether arrays is strictly increasing
	public static boolean check(int[] arr, int n){
		for(int i=0; i<n-1; i++){
			if(arr[i]>arr[i+1]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
		int[] arr2 = {2, 1, 3, 5};
		System.out.println("Is array 1{1, 2, 3, 4, 5, 6, 7} strictly increasing? "+(check(arr1, 7)?"Yes":"NO"));
		System.out.println("Is array 2{2, 1, 3, 5} strictly increasing? "+(check(arr2, 4)?"Yes":"No"));
	}
}