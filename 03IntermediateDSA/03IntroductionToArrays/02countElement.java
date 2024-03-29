/*
Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.
*/
import java.util.*;
class Problem2{
	//Function to calculate count of elements which have atleast 1 element greater then itself.
	public static int countElements(ArrayList<Integer> arr){
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i)>max){
				max = arr.get(i);
			}
		}
		int count=0;
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i)<max){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		ArrayList<Integer> arr1 = new ArrayList<Integer>(
			Arrays.asList(3, 1, 2)
		);
		System.out.println("Count of elements which has atleast one element greater : "+countElements(arr1));
		ArrayList<Integer> arr2 = new ArrayList<Integer>(
			Arrays.asList(8, 8, 8)
		);
		System.out.println("Count of elements which has atleast one element greater : "+countElements(arr2));
		
	}
}