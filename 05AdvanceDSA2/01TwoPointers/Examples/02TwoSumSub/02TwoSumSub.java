/*
    Given a sorted int array & an integer k>0
    Find any pair(i, j) such that A[j]-A[i]=k space complexity=O(1)
 */

class Pair<A, B>{
    A a;
    B b;
    public Pair(A a, B b){
        this.a = a;
        this.b = b;
    }
    public void printPair(){
        System.out.println(a + ", " + b);
    }
}

class TwoSum{
    ArrayList<Integer> arr1;

    public TwoSum(ArrayList<Integer> arr1){
        this.arr1 = arr1;
    }

    public Pair<Integer, Integer> getPair(int k){
        int i=0, j=1;

        while(j<arr.size()){
            if(arr1.get(j)-arr1.get(i) == k){
                return new Pair<Integer, Integer>(arr1.get(i), arr1.get(j));
            }else if(arr1.get(j)-arr1.get(i) > k){
                i++;
            }else{
                j++;
            }
        }
        return new Pair<Integer, Integer>(-1, -1);
    }
}