/*
    You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of
    each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.
 */

import java.util.*;

class FactorialSort{
    public static class factorClass implements Comparator<Integer>{
        public int factor(int N){
            int count=0;

            for(int i=1; i*i<=N; i++){
                if(N%i==0){
                    if(i == N/i){
                        count++;
                    }else{
                        count += 2;
                    }
                }
            }
            return count;
        }

        @Override
        public int compare(Integer a, Integer b){
            int fa = factor(a);
            int fb = factor(b);

            if(fa < fb){
                return -1;
            }else if(fa>fb){
                return 1;
            }
            else{
                return a-b;
            }
        }
    }

    public static ArrayList<Integer> sortFactorial(ArrayList<Integer> arr) {
        Collections.sort(arr, new factorClass());

        return arr;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(6, 8, 9)
        );
        System.out.println("After sorting array Elements are : ");
        for(int i : sortFactorial(arr)){
            System.out.print(i + " ");
        }

        return;
    }
}