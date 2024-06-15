/*
    Given a binary sorted matrix A of size N*N. Find the row with the maximum number of 1.
    If 2 rows have the maximum number of 1, then return the row with lower index.
    Each row is sorted.
 */

import java.util.*;

class BruteForce{
    private List<ArrayList<Integer>> list;

    BruteForce(List<ArrayList<Integer>> list){
        this.list = list;
    }

    private int returnIndex(){
        int max=0, index=-1;
        for(int i=0; i<list.size(); i++){
            int count=0;
            for(int j=0; j<list.get(i).size(); j++){
                if(list.get(i).get(j)==1){
                    count++;
                }
            }
            if(count>max){
                max = count;
                index = i;
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(
                Arrays.asList(0, 0, 0)
        );
        ArrayList<Integer> list2 = new ArrayList<Integer>(
                Arrays.asList(0, 0, 0)
        );
        ArrayList<Integer> list3 = new ArrayList<Integer>(
                Arrays.asList(0, 0, 0)
        );
        List<ArrayList<Integer>> list = new ArrayList<>(
                Arrays.asList(list1, list2, list3)
        );

        BruteForce bf = new BruteForce(list);

        System.out.println("Rows with Max 1 = "+bf.returnIndex());
    }

}