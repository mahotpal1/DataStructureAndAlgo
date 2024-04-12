/*
Given a 2D array return its transpose.
 */

import java.lang.reflect.Array;
import java.util.*;

class Transpose{
    // Print Matrix
    public static void print(ArrayList<ArrayList<Integer>> arr){
        for(ArrayList<Integer> x: arr){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    // Return Transpose
    public static ArrayList<ArrayList<Integer>> returnTranspose(ArrayList<ArrayList<Integer>> arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<arr.get(0).size(); i++){
            ArrayList<Integer> ans_sub = new ArrayList<Integer>();
            for(int j=0; j<arr.size(); j++){
                ans_sub.add(arr.get(j).get(i));
            }
            ans.add(ans_sub);
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
        arr.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
        arr.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
        print(returnTranspose(arr));
        return;
    }
}