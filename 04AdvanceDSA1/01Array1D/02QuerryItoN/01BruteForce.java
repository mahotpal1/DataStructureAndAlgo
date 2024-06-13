/*
 for n set of querries(i, j) add j from i to n
 */
import java.util.*;

class BruteForce {

    private int[] getMyArray(List<ArrayList<Integer>> q) {
        int[] arr = new int[10];
        for(int i=0; i<q.size(); i++){
            for(int j=q.get(i).get(0); j<10; j++){
                arr[j] += q.get(i).get(1);
            }
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
                Arrays.asList(1, 3)
        );
        ArrayList<Integer> arr2 = new ArrayList<Integer>(
                Arrays.asList(4, 2)
        );
        ArrayList<Integer> arr3 = new ArrayList<Integer>(
                Arrays.asList(3, 1)
        );
        BruteForce bt = new BruteForce();
        bt.printMyArray(Arrays.asList(arr1, arr2, arr3));
    }
}