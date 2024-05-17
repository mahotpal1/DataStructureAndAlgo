/*
    Given an integer array A, find if an integer p exists in the array
    such that the number of integers greater than p in the array equals p.
 */

import java.util.*;

class Main{
    public static boolean solve(ArrayList<Integer> arr){
        Collections.sort(arr);
        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(i) == arr.get(i+1)){
                continue;
            }
            if(arr.get(i) == arr.size()-1-i){
                return true;
            }
        }
        if(arr.get(arr.size()-1) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(1, 1, 3, 3)
        );
        if(solve(arr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}