/*
    Given an integer array as input return the frequency map
 */

import java.util.*;

class MyHashMap{
    // Function to return frequency map
    public static HashMap<Integer, Integer> createFrequency(ArrayList<Integer> arr){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.size(); i++){
            if(!hm.containsKey(arr.get(i))){
                hm.put(arr.get(i), 1);
            }else{
                hm.put(arr.get(i), hm.get(arr.get(i)) + 1);
            }
        }
        return hm;
    }

    // Main Function
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(1, 4, 3, -2, 1, 1, 4, 5, 3)
        );

        for(int x: createFrequency(arr).keySet()){
            System.out.println(x + "->" + createFrequency(arr).get(x));
        }
        return;
    }
}