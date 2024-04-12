/*
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
Specifically, make entire ith row and jth column zero.
 */

import java.lang.reflect.Array;
import java.util.*;

class MakeRowColZero{
    // Print Matrix
    public static void print(ArrayList<ArrayList<Integer>> arr){
        for(ArrayList<Integer> x: arr){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

    // Function to find all the cells
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> arr){
        int rows = arr.size();
        int cols = arr.get(0).size();

        // Arrays to keep track of rows and columns to be zeroed
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Traverse the matrix to find cells containing zero
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(arr.get(i).get(j) == 0){
                    zeroRows[i] = true;  // Mark the row containing zero
                    zeroCols[j] = true;  // Mark the column containing zero
                }
            }
        }

        // Set rows containing zero to zero
        for(int i = 0; i < rows; i++){
            if(zeroRows[i]){
                for(int j = 0; j < cols; j++){
                    arr.get(i).set(j, 0);
                }
            }
        }

        // Set columns containing zero to zero
        for(int j = 0; j < cols; j++){
            if(zeroCols[j]){
                for(int i = 0; i < rows; i++){
                    arr.get(i).set(j, 0);
                }
            }
        }

        return arr;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>(
        );
        arr1.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
        arr1.add(new ArrayList<Integer>(Arrays.asList(5, 6, 7, 0)));
        arr1.add(new ArrayList<Integer>(Arrays.asList(9, 2, 0, 4)));
        print(solve(arr1));
        return;
    }
}