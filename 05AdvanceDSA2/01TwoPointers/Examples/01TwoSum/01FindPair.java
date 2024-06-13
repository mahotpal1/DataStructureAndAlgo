/*
    Given a Sorted integer array and an integer k. Find any pair (i, j) such that A[i]+A[j]=k & i!=j
    Space complexity = O(1)
 */
import java.util.*;

class Pair<A, B>{
    A first;
    B second;

    public Pair(A a, B b){
        this.first = a;
        this.second = b;
    }

    public void printPair(){
        System.out.println(first.toString() + ", " + second.toString());
    }
}

class FindPair{
    ArrayList<Integer> arr;

    public FindPair(ArrayList<Integer> arr){
        this.arr = arr;
    }

    public Pair<Integer, Integer> getPair(int k){
        int i=0, j=this.arr.size()-1;
        while(i<j){
            if(arr.get(i)+arr.get(j) == k){
                return new Pair<Integer, Integer>(arr.get(i), arr.get(j));
            }else if(arr.get(i)+arr.get(j) < k){
                i++;
            }else{
                j--;
            }
        }
        return new Pair<Integer, Integer>(-1, -1);
    }
}

class Client{
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(
                // Passing sorted integer array
                Arrays.asList(-5, -2, 1, 8, 10, 12, 15)
        );
        FindPair p1 = new FindPair(arr1);
        Pair<Integer, Integer> pair1 = p1.getPair(11);
        pair1.printPair();
    }
}