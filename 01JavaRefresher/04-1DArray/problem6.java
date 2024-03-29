import java.util.*;

class Problem6{
	//Function to calculate frequency of 1
	public static int countFrequencyOf1(int[] arr, int n){
		int count = 0;
		for(int i=0; i<n; i++){
			if(arr[i] == 1){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		int[] arr = {1, 1, 3, 4, 1, 1, 6 ,7, 1, 9};
		System.out.println("Frequency of 1 in Array arr : " + countFrequencyOf1(arr, 10));
		return;
	}
} 