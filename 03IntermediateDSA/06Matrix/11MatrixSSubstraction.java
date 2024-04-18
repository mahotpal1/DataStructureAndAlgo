/*
    You are given two integer matrices A and B having same size(Both having same number of rows (N)
    and columns (M). You have to subtract matrix B from A and return the resultant matrix.
    (i.e. return the matrix A - B).

    If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
 */

import java.util.ArrayList;
import java.util.Arrays;

class SubTheMatices{
    public static ArrayList<ArrayList<Integer>> subMax(ArrayList<ArrayList<Integer>> max1, ArrayList<ArrayList<Integer>> max2){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if(max1.size() != max2.size() || max1.get(0).size() != max2.get(0).size()){
            return ans;
        }
        for(int i = 0; i < max1.size(); i++){
            ArrayList<Integer> sub_ans = new ArrayList<Integer>();
            for(int j = 0; j < max1.get(0).size(); j++){
                sub_ans.add(max1.get(i).get(j)-max2.get(i).get(j));
            }
            ans.add(sub_ans);
        }
        return ans;
    }
    // Print Matrix
    public static void print(ArrayList<ArrayList<Integer>> arr){
        for(ArrayList<Integer> x: arr){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>(
        );
        arr1.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        arr1.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        arr1.add(new ArrayList<Integer>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<ArrayList<Integer>>(
        );
        arr2.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        arr2.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        arr2.add(new ArrayList<Integer>(Arrays.asList(7, 3, 9)));
        print(subMax(arr1, arr2));
        return;
    }
}