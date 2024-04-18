/*
    Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
    You may assume that the array is non-empty and the majority element always exists in the array.
    To do : Cross check for vals {2, 1, 6, 2, 4}
*/

import java.util.*;

class Problem3 {
    public static int getMajority(ArrayList<Integer> arr){
        int _maj=arr.get(0), count=1;
        for(int i=1; i<arr.size(); i++){
            if(count==0){
               _maj=arr.get(i);
               count=1;
            }else{
                if(_maj == arr.get(i)){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return _maj;
    } 
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(
            Arrays.asList(1, 1, 1));
        
        System.out.println("Majority Element = "+getMajority(arr));
        return;
    }
}