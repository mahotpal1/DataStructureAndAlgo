/*
    Store a prefix sum array and use it for calculating maximum
 */
import java.util.*;

class UsingPrefixSum{
    ArrayList<Integer> arr1;

    public UsingPrefixSum(ArrayList<Integer> arr1){
        this.arr1 = arr1;
    }

    public ArrayList<Integer> returnPrefixSum(){
        ArrayList<Integer> pf = new ArrayList<Integer>();
        pf.add(this.arr1.get(0));
        for(int i=1; i<this.arr1.size(); i++){
            pf.add(this.arr1.get(i)+pf.get(i-1));
        }
        return pf;
    }

    public int returnMaxSum(){
        int ans=this.arr1.get(0);
        ArrayList<Integer> pf = returnPrefixSum();
        for(int i=0; i<this.arr1.size(); i++){
            for(int j=i; j<this.arr1.size(); j++){
                // get each subarray sum
                if(pf.get(j)-pf.get(i)>ans){
                    ans = pf.get(j)-pf.get(i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        UsingPrefixSum us = new UsingPrefixSum(new ArrayList<Integer>(
                Arrays.asList(-2, 3, 4, -1, 5, -10, 7)
                ));
        System.out.println(us.returnMaxSum());
    }
}