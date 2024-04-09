/*
    Column Sum : 
    Return the arraylist containing the sum of each column
*/

import java.util.*;

public class Main
{
    public static ArrayList<Integer> ColumnSum(ArrayList<ArrayList<Integer>> arr){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<arr.get(0).size(); i++){
            int sum = 0;
            for(int j=0; j<arr.size(); j++){
                sum += arr.get(j).get(i);
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
	    
	    System.out.println("Column sum is : ");
	    for(int x : ColumnSum(arr)){
	        System.out.print(x+" ");
	    }
	    System.out.println();
	    
	    return;
	}
}