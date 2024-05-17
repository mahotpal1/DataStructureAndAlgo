/*
    Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
    A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 */

import java.util.*;

class MyClass{
    public static boolean check(ArrayList<Integer> arr){
        int d = arr.get(1)-arr.get(0);
        Collections.sort(arr);
        for(int i=0; i<arr.size()-1; i++){
            if(arr.get(i+1)-arr.get(i) != d){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(3, 5, 1)
        );

        System.out.println("Is Possible : " + check(arr));
    }
}
