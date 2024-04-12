/*
    Minor Diagonal sum
*/

import java.util.*;

public class Main
{
    public static int rowSum(ArrayList<ArrayList<Integer>> arr){
        int i=arr.size()-1, j=0, sum=0; 
        while(i>=0){
            sum += arr.get(i).get(j);
            i--;
            j++;
        }
        return sum;
    }
    
	public static void main(String[] args) {
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	    arr.add(new ArrayList<Integer>(Arrays.asList(1, -2, -3)));
	    arr.add(new ArrayList<Integer>(Arrays.asList(-4, 5, -6)));
	    arr.add(new ArrayList<Integer>(Arrays.asList(-7, -8, 9)));
	   
	    System.out.println("Sum of anti diagonal elements : " + rowSum(arr));
	    System.out.println();
	    
	    return;
	}
}