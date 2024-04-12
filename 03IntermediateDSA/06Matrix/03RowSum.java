/*
    Row Sum : 
    Return the arraylist containing the sum of each Row
*/

import java.util.*;

public class Main
{
    public static ArrayList<Integer> rowSum(ArrayList<ArrayList<Integer>> arr){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<arr.size(); i++){
            int sum = 0;
            for(int j=0; j<arr.get(0).size(); j++){
                sum += arr.get(i).get(j);
            }
            ans.add(sum);
        }
        return ans;
    }
    
	public static void main(String[] args) {
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	    arr.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
	    arr.add(new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8)));
	    arr.add(new ArrayList<Integer>(Arrays.asList(9, 2, 3, 4)));
	    
	    System.out.println("Row sum are : ");
	    for(int x : rowSum(arr)){
	        System.out.print(x+" ");
	    }
	    System.out.println();
	    
	    return;
	}
}