import java.util.*;

class OptimisedSolution{
    private int[] getMyArray(List<ArrayList<Integer>> q) {
        int[] arr = new int[10];
        for(int i=0; i<q.size(); i++){
            arr[q.get(i).get(0)] += q.get(i).get(1);
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
                Arrays.asList(1, 3)
        );
        ArrayList<Integer> arr2 = new ArrayList<Integer>(
                Arrays.asList(4, 2)
        );
        ArrayList<Integer> arr3 = new ArrayList<Integer>(
                Arrays.asList(3, 1)
        );
        OptimisedSolution bt = new OptimisedSolution();
        bt.printMyArray(Arrays.asList(arr1, arr2, arr3));
    }
}