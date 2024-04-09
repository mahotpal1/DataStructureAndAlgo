/*
    You are given a N X N integer matrix. 
    You have to find the sum of all the main diagonal elements of A.
    Main diagonal of a matrix A is a collection of elements A[i,j] such that i=j.
*/

import java.util.*;

public class Main
{
    public static int sumOfMainDiagonalElements(ArrayList<ArrayList<Integer>> arr){
        int sum=0;
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<=i; j++){
                sum += arr.get(i).get(j);
            }
        }
        return sum;
    }
    
	public static void main(String[] args) {
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	    arr.add(new ArrayList<Integer>(Arrays.asList(2, 2, 3)));
	    arr.add(new ArrayList<Integer>(Arrays.asList(2, 2, 3)));
	    System.out.println("Sum of all diagonal elements : "+sumOfMainDiagonalElements(arr));
	    return;
	}
}