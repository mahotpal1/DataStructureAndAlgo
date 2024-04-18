/*
 *   Give a N * N square matrix A, return an array of its anti-diagonals.
 */

import java.util.*;

public class Main{
    // Method to return the anti diagonal elements
    public static ArrayList<ArrayList<Integer>> returnList(ArrayList<ArrayList<Integer>> arr){
        int m=arr.size(), n=arr.size();
        ArrayList<ArrayList<Integer>> ans_list = new ArrayList<ArrayList<Integer>>();
        // First add from all the rows diagonally
        for(int i=0; i<n; i++){
            int r=0, c=i;
            ArrayList<Integer> rowdiag = new ArrayList<Integer>();
            while(r<n && c>=0){
                rowdiag.add(arr.get(r).get(c));
                r++;
                c--;
            }
            ans_list.add(rowdiag);
        }
        // Then add from all the column wise diagonally
        for(int i=1; i<n; i++){
            int r=i;
            int c=m-1;
            ArrayList<Integer> coldiag = new ArrayList<Integer>();
            while(r<n && c>=0){
                coldiag.add(arr.get(r).get(c));
                r++;
                c--;
            }
            ans_list.add(coldiag);
        }
        return ans_list;
    }
    public static void print(ArrayList<ArrayList<Integer>> arr){
        System.out.println("All array elements are : ");
        for(ArrayList<Integer> x: arr){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        arr.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<Integer>(Arrays.asList(7, 8, 9)));

        print(returnList(arr));
        return;
    }
}