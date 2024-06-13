/*
    Bruteforce solution is same as previous one.
    Optimised solution is add at first index remove at drop out index-1.
 */

import java.util.*;

class OptimisedSolution{
    private int[] getMyArray(List<ArrayList<Integer>> q) {
        int[] arr = new int[10];
        for(int i=0; i<q.size(); i++){
            if(q.get(i).get(1) == 9){
                arr[q.get(i).get(0)] += q.get(i).get(2);
            }else{
                arr[q.get(i).get(0)] += q.get(i).get(2);
                arr[q.get(i).get(1)+1] -= q.get(i).get(2);
            }
        }
        for(int i=1; i<10; i++){
            arr[i] += arr[i-1];
        }

        return arr;
    }

    public void printMyArray(List<ArrayList<Integer>> q) {
        for(int i: getMyArray(q)){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(
                Arrays.asList(1, 3, 2)
        );
        ArrayList<Integer> arr2 = new ArrayList<Integer>(
                Arrays.asList(2, 5, 3)
        );
        ArrayList<Integer> arr3 = new ArrayList<Integer>(
                Arrays.asList(5, 6, -1)
        );
        OptimisedSolution bt = new OptimisedSolution();
        bt.printMyArray(Arrays.asList(arr1, arr2, arr3));
    }
}