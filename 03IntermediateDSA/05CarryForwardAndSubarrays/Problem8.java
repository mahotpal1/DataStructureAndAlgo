/*
	Problem 8 : You are given an integer array A of size N.
				You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
				Find and return the maximum possible sum of the B elements that were removed after the B operations.

				NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

				Remove 3 elements from front and 0 elements from the back, OR
				Remove 2 elements from front and 1 element from the back, OR
				Remove 1 element from front and 2 elements from the back, OR
				Remove 0 elements from front and 3 elements from the back.
*/
import java.util.*;
class Problem8{
	public static int solve(ArrayList<Integer> A, int B){
		int sum=0, i=0;
		for(i=0; i<B; i++){
			sum += A.get(i);
		}
		int sum_last=sum;
		int B_new = B, j=A.size()-1;
		while(B_new != 0){
			sum -= A.get(--i);
			sum += A.get(j--);
			if(sum_last < sum){
				sum_last = sum;
			}
			B_new--;
		}
		return sum_last;
	}
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(5, -2, 3, 1, 2)
		);
		System.out.println("Ans : "+solve(arr, 3));
		return;
	}
}