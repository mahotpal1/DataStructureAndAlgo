/*
    You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
    For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].

    Note : Use 0-based indexing
*/

import java.util.*;

class Problem1 {
    public static ArrayList<Integer> getList(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> querry){
        ArrayList<Integer> pf = new ArrayList<Integer>();
        pf.add(arr.get(0));
        for(int i=1; i<arr.size(); i++){
            if(i%2 == 0){
                pf.add(arr.get(i)+pf.get(i-1));
            }else{
                pf.add(pf.get(i-1));
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<querry.size(); i++){
                if(querry.get(i).get(0) == 0){
                ans.add(pf.get(querry.get(i).get(1)));
            }else{
                ans.add(pf.get(querry.get(i).get(1)) - pf.get(querry.get(i).get(0)-1));
            }
        }
        
        return ans;
    } 
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(
            Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<ArrayList<Integer>> querry = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> x1 = new ArrayList<Integer>(
            Arrays.asList(0, 2)
            );
        querry.add(x1);
        ArrayList<Integer> x2 = new ArrayList<Integer>(
            Arrays.asList(1, 4)
            );
        querry.add(x2);
        System.out.println("The list of elements for given querry and array is : ");
        for(int x: getList(arr, querry)){
            System.out.print(x+" ");
        }
        System.out.println();
        return;
    }
}