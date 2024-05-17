/*
Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.

If a number has no tens digit, we can assume value to be 0.
If 2 numbers have same tens digit, in that case number with max value will come first
Solution should be based on comparator.
 */
import java.util.*;

public class Solution {
    public int[] solve(int[] A) {
        Integer[] arr = new Integer[A.length];
        for(int i = 0; i < A.length; i++){
            arr[i] = A[i];
        }
        Collections.sort(arr,new tensDigit() );
        for(int i = 0; i < A.length; i++){
            A[i] = arr[i];
        }
        return A;
    }
    class tensDigit implements Comparator<Integer> {
        public int compare(Integer a , Integer b) {
            int ta = (a/10)%10;
            int tb = (b/10)%10;
            if(ta == tb) {
                return b-a; //If 2 numbers have same tens digit, in that case number with max value will come first
            }
            return ta-tb;
        }
    }

    public static void main(String[] args){

        return;
    }
}
