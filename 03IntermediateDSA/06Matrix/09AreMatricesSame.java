/*
You are given two matrices A and B of equal dimensions and you have to check whether
two matrices are equal or not.
*/

import java.lang.reflect.Array;
import java.util.*;

class AreMatricesSame{
    //check two matrices
    public static boolean checkSimilarity(ArrayList<ArrayList<Integer>> arr1, ArrayList<ArrayList<Integer>> arr2){
        if(arr1.size() != arr2.size() || (arr2.get(0).size() != arr2.get(0).size())){
            return false;
        }
        for(int i=0; i<arr1.size(); i++){
            for(int j=0; j<arr2.size(); j++){
                if(arr1.get(i).get(j) != arr2.get(i).get(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>(
        );
        arr1.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        arr1.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        arr1.add(new ArrayList<Integer>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<ArrayList<Integer>>(
        );
        arr2.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        arr2.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        arr2.add(new ArrayList<Integer>(Arrays.asList(7, 3, 9)));
        System.out.println("Are above two matrix same ? "+checkSimilarity(arr1, arr2));
        return;
    }
}