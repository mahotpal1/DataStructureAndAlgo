/*
    Brute force strategy to calculate rain water tappering
 */
import java.util.*;

class BruteForceApproach{

    private int getmax(ArrayList<Integer> arr, int i, int j){
        int max = arr.get(i);
        for(int k=i+1; k<=j; k++){
            if(arr.get(k) > max){
                max = arr.get(k);
            }
        }
        return max;
    }

    public int returnTapperedWater(ArrayList<Integer> arr){
        int tappered_water=0;
        for(int i=1; i<arr.size(); i++){
            int lmax = getmax(arr, 0, i-1);
            int rmax = getmax(arr, i, arr.size()-1);
            int minAmong = Math.min(lmax, rmax);
            if(minAmong > arr.get(i)){
                tappered_water += minAmong-arr.get(i);
            }
        }
        return tappered_water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> my_array = new ArrayList<Integer>(
                Arrays.asList(4, 2, 5, 7, 4, 2, 3, 6, 8, 2, 3)
        );

        System.out.println(new BruteForceApproach().returnTapperedWater(my_array));
    }
}