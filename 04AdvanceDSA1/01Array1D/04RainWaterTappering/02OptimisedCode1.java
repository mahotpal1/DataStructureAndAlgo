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
        setMax(arr);
        int total_tappered_water = 0;
        for(int i=1; i<arr.size()-1; i++){
            int tappered_water=Math.min(leftMax[i-1], rightMax[i+1]) - arr.get(i);
            if(tappered_water > 0){
                total_tappered_water += tappered_water;
            }
        }

        return total_tappered_water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> my_array = new ArrayList<Integer>(
                Arrays.asList(4, 2, 5, 7, 4, 2, 3, 6, 8, 2, 3)
        );

        System.out.println(new BruteForceApproach().returnTapperedWater(my_array));
    }
}