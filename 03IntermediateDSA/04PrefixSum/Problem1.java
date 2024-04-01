/*
	Problem 1 : You are given an integer array A of length N.
				You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
				For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
				More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
*/
import java.util.*;

class Problem1{
	public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<List<Integer>> B){
		// Array to create prefix sum array
		ArrayList<Integer> prefix_sum = new ArrayList<Integer>();
		prefix_sum.add(A.get(0));
		
		// Populating prefix sum array
		for(int i=1; i<A.size(); i++){
			prefix_sum.add(A.get(i)+prefix_sum.get(i-1));
		}
		
		// Ans array
		ArrayList<Integer> ans = new ArrayList<Integer>();
		// For B querries 
		for(int i=0; i<B.size(); i++){
			// Add sum for range B[i][1] to B[i][0]
			if(B.get(i).get(0) == 0){
				ans.add(prefix_sum.get(B.get(i).get(1)));
			}else{
				ans.add(prefix_sum.get(B.get(i).get(1))-prefix_sum.get(B.get(i).get(0)-1));
			}
		}
		return ans;
	}
	public static void print(ArrayList<Integer> arr){
		for(int x: arr){
			System.out.print(x+" ");
		}
		return;
	}
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(1, 2, 3, 4, 5)
		);
		ArrayList<List<Integer>> li = new ArrayList<List<Integer>>();
		li.add(Arrays.asList(0, 3));
		li.add(Arrays.asList(1, 2));
		print(solve(arr, li));
		return;
	}
}