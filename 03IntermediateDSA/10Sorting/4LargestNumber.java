/*
    Given an array A of non-negative integers, arrange them such that they form the largest number.
    Note: The result may be very large, so you need to return a string instead of an integer.
 */

import java.util.*;

class LargestNumber{
    public static class largest implements Comparator<Integer> {
        public int compare(Integer a , Integer b) {
            String s1 =String.valueOf(a)+String.valueOf(b);
            String s2 =String.valueOf(b)+String.valueOf(a);
            return s2.compareTo(s1);
        }
    }

    public static String largestNumber(int[] A) {
        Integer[] arr = new Integer[A.length];
        for(int i = 0; i < A.length; i++){
            arr[i] = A[i];
        }
        Arrays.sort(arr,new largest());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Integer.toString(arr[i]));
        }
        if(arr[0] == 0){
            return "0";
        }
        return sb.toString();
    }

    public static void main(String[] args){
        int[] arr = new int[]{3, 30, 34, 5, 9};

        System.out.println("Largest number for given Array : " + largestNumber(arr));
        return;
    }
}