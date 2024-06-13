/*
    For given Array of integer elements, find the maximum subarray sum.
 */
import java.util.*;

class BruteForce{
    ArrayList<Integer> arr1;

    public BruteForce(ArrayList<Integer> arr1){
        this.arr1 = arr1;
    }

    public int findMaxSum(){
        int ans=this.arr1.get(0);
        for(int i=0; i<this.arr1.size(); i++){
            for(int j=i; j<this.arr1.size(); j++){
                int sum=0;
                // subarray [i, j]
                for(int k=i; k<=j; k++){
                    sum += this.arr1.get(k);
                }
                if(sum > ans) {
                    ans = sum;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        BruteForce bf = new BruteForce(new ArrayList<Integer>(
                Arrays.asList(-2, 3, 4, -1, 5, -10, 7)
        ));
        System.out.println(bf.findMaxSum());
    }
}