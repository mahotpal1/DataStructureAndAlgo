/*
    Given an array, arr[] of size N, the task is to find the count of array indices such that removing an
    element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

    i.e After removing, 
    odd + even = even + odd;
*/

import java.util.*;

class Problem3 {
    public static int getCount(ArrayList<Integer> arr){
        ArrayList<Integer> evenArray = new ArrayList<Integer>();
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
       
        evenArray.add(arr.get(0));
        oddArray.add(0);
        for(int i=1; i<arr.size(); i++){
           if(i%2 == 0){
               evenArray.add(arr.get(i)+evenArray.get(i-1));
               oddArray.add(oddArray.get(i-1));
           }else{
               oddArray.add(arr.get(i)+oddArray.get(i-1));
               evenArray.add(evenArray.get(i-1));
           }
        }
        int count=0;
        if((oddArray.get(arr.size()-1)) == (evenArray.get(arr.size()-1) - evenArray.get(0))){
            count++;
        }
        for(int i=1; i<arr.size(); i++){
            int a = evenArray.get(i-1) + oddArray.get(arr.size()-1) - oddArray.get(i);
            int b = oddArray.get(i-1) + evenArray.get(arr.size()-1) - evenArray.get(i);
                //int a = PFe[i-1] + PFo[A.size()-1] - PFo[i];
                //int b = PFo[i-1] + PFe[A.size()-1] - PFe[i];
            if(a == b){
                count++;
            }
        }
        return count;
    } 
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(
            Arrays.asList(2, 1, 6, 4));
        
        System.out.println("Total count of indices = "+getCount(arr));
        return;
    }
}s