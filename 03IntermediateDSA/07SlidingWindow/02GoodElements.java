/*
    	2.  Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring
    	    all the numbers less than or equal to B together.
	        Note: It is possible to swap any two elements, not necessarily consecutive.
 */

import java.util.*;

class MyGoodSize{
    public static int getSize(ArrayList<Integer> arr, int B){
        int good_elements=0, bad_elements=0;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)<=B){
                good_elements++;
            }
        }
        if(good_elements == 0 || good_elements == 1){
            return 0;
        }
        for(int i=0; i<good_elements; i++) {
            if (arr.get(i) > B) {
                bad_elements++;
            }
        }

        int start=1, end=good_elements, ans=bad_elements;
        while(end < arr.size()){
            if(arr.get(start-1) > B){
                bad_elements--;
            }
            if(arr.get(end)>B){
                bad_elements++;
            }
            if(bad_elements < ans){
                ans=bad_elements;
            }
            start++;
            end++;
        }
        return ans;
    }
    // Handler Function
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(1, 12, 10, 3, 14, 10, 5)
        );
        System.out.println("What is the window for above : " + getSize(arr, 8));
        return;
    }
}