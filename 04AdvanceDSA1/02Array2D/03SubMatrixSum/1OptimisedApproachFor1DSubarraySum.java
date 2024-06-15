/*
    Calculate the subarray sum in O(N)
 */
import java.util.*;

class OptimisedApproachFor1DSubarraySum {
    ArrayList<Integer> list;

    public OptimisedApproachFor1DSubarraySum(ArrayList<Integer> list) {
        this.list = list;
    }

    public int returnSubarraySum(){
        int sum = 0;

        for(int i=0; i<this.list.size(); i++){
            sum += this.list.get(i)*(list.size()-i)*(i+1);
        }

        return sum;
    }

    public static void main(String[] args) {
        OptimisedApproachFor1DSubarraySum obj1 = new OptimisedApproachFor1DSubarraySum(new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 5)
        ));
        System.out.println(obj1.returnSubarraySum());
    }
}