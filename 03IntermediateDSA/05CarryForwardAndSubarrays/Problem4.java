/*
	Problem 4 : Say you have an array, A, for which the ith element is the price of a given stock on day i.
				If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
				Return the maximum possible profit.
*/

import java.util.*;

class Problem4{
	public static int maxProfit(ArrayList<Integer> arr){
		if(arr.size()<=0){
			return 0;
		}
		int maxi = 0, mini=0, max=0;
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i)>arr.get(maxi)){
				maxi = i;
			}
			if(arr.get(i) < arr.get(mini)){
				mini = i;
				maxi = i;
			}
			if(max < arr.get(maxi)-arr.get(mini)){
				max = arr.get(maxi)-arr.get(mini);
			}
		}
		return max;
	}
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(1, 4, 5, 2, 4)
		);
		System.out.println("The maximum prossible profit is : " + maxProfit(arr));
		return;
	}
}