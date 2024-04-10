/*
		Problem 2: Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of
           		   the maximum value of the array and at least one occurrence of the minimum value of the array.
				   
		Solution Approach : Store max and min, then iterate from last to first and if element is max ()
*/

import java.util.*;

class Problem2{
	public static int returnMaxSize(ArrayList<Integer> arr){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i: arr){
			if(i > max){
				max = i;
			}
			if(i < min){
				min = i;
			}
		}
		int mini=-1, maxi=-1, size=arr.size();
		
		for(int i=arr.size()-1; i>=0; i--){
			if(arr.get(i) == max){
				maxi = i;
				if(mini != -1){
					if(mini-maxi+1 < size){
						size = mini-maxi+1;
					}
				}
			}else if(arr.get(i) == min){
				mini = i;
				if(maxi != -1){
					if(maxi-mini+1 < size){
						size = maxi-mini+1;
					}
				}
			}
		}
		return size;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(2, 6, 1, 6, 9)
		);
		System.out.println("Maximum size of the array with max and min in window : " + returnMaxSize(arr));
		return;
	}
}