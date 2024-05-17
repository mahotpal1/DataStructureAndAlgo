/*
    You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of
    each element, i.e., element having the least number of factors should be the first to be displayed and the number
    having highest number of factors should be the last one. If 2 elements have same number of factors, then number with
    less value should come first.
 */

import java.util.*;

class Main{
    public static int countFactors(int n){
        int count=0;
        // Iterate through possible divisors up to the square root of n.
        for(int i=1; i*i<=n; i++){
            // If i is a divisor, count it and check if its pair is also a divisor.
            if(n % i == 0){
                if(i*i == n){
                    count++;
                }
                else{
                    // If i and n/i are distinct divisors, count both.
                    count += 2;
                }
            }
        }
        // Return the total count of factors.
        return count;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(
                Arrays.asList(6, 8, 9)
        );
        arr.sort(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                // Compare based on the count of factors.
                int fa = countFactors(a);
                int fb = countFactors(b);

                // If the counts are equal, sort by the actual values.
                if (fa == fb) {
                    return a - b;
                }
                // Otherwise, sort by the count of factors.
                else {
                    return fa - fb;
                }
            }
        });
        System.out.println("After Sorting elements are : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}