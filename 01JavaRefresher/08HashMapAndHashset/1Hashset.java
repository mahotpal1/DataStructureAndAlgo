/*
    Given two hash sets, return the common elements in them.
 */

import java.util.*;

class MyHashSet{
    // Return arraylist of Common Elements in both hashset
    public static ArrayList<Integer> returnList(HashSet<Integer> hs1, HashSet<Integer> hs2){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        // To iterate for each element in hashset
        for(int i: hs1){
            // checks whether element i is there in hs2
            if(hs2.contains(i)){
                // adds element to the ans arraylist
                ans.add(i);
            }
        }
        return ans;
    }

    // Create hashset using dynamic array elements
    public static HashSet<Integer> createSet(ArrayList<Integer> arr){
        HashSet<Integer> hs1 = new HashSet<Integer>();
        for(int i=0; i<arr.size(); i++){
            hs1.add(arr.get(i));
        }
        return hs1;
    }

    // Executable
    public static void main(String[] args){
        ArrayList<Integer> ar1 = new ArrayList<Integer>(
                Arrays.asList(1, -2, 3, 4, 5)
        );
        ArrayList<Integer> ar2 = new ArrayList<Integer>(
                Arrays.asList(0, -2, 3, 10)
        );
        System.out.print("Common Elements are : { ");
        // Create hashset and pass to returnList Function
        for(int x: returnList(createSet(ar1), createSet(ar2))){
            System.out.print(x + " ");
        }
        System.out.print("}");
        return;
    }
}