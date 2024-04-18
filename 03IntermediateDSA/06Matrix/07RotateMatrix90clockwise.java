/*
You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
You need to do this in place.
Note: If you end up using an additional array, you will only receive partial score.
 */

import java.util.*;

class RotateMatrix90clockwise{
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
    // ReverseArray
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> arr){
        int start=0;
        int end = arr.size()-1;
        while(start<end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
        return arr;
    }
    // Rotate Array by 90
    public static ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> arr){
        arr = returnTranspose(arr);
        for(int i=0; i<arr.size(); i++){
            arr.set(i, reverseArray(arr.get(i)));
        }
        return arr;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
        arr.add(new ArrayList<Integer>(Arrays.asList(2, 4)));
        print(rotate(arr));
        return;
    }
}