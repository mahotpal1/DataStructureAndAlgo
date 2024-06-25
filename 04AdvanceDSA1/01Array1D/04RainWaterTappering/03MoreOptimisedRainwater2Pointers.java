/*
    Optimised code by adding array which store left max and right max
 */

import java.util.*;

class BruteForceApproach{

    int[] leftMax = new int[11];
    int[] rightMax = new int[11];

    private void setMax(ArrayList<Integer> arr){
        leftMax[0] = arr.get(0);
        for(int i=1; i<arr.size(); i++){
            leftMax[i] = Math.max(leftMax[i-1], arr.get(i));
        }
        rightMax[arr.size()-1] = arr.get(arr.size()-1);
        for(int i=arr.size()-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr.get(i));
        }
    }

    public int returnTapperedWater(ArrayList<Integer> arr){
        int i=0;
        int j=arr.size()-1;
        int lMax=arr.get(0);
        int rMax=arr.get(arr.size()-1);
        int water = 0, answer=0;
        while(i<j){
            if(lMax<rMax){
                i++;
                water = lMax-arr.get(i);
                lMax = Math.max(lMax, arr.get(i));
            }else{
                j--;
                water = rMax-arr.get(j);
                rMax = Math.max(rMax, arr.get(j));
            }
            if(water>0){
                answer += water;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrayList<Integer> my_array = new ArrayList<Integer>(
                Arrays.asList(1,8,6,2,5,4,8,3,7)
        );

        System.out.println(new BruteForceApproach().returnTapperedWater(my_array));
    }
}