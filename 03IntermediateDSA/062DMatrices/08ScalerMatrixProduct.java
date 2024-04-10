/*
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
 */

import java.util.*;

class MatrixProduct{
    // Print Matrix
    public static void print(ArrayList<ArrayList<Integer>> arr){
        for(ArrayList<Integer> x: arr){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> arr, int B){
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(0).size(); j++){
                arr.get(i).set(j, arr.get(i).get(j)*B);
            }
        }
        return arr;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
        arr.add(new ArrayList<Integer>(Arrays.asList(2, 4)));
        print(solve(arr, 3));
        return;
    }
}