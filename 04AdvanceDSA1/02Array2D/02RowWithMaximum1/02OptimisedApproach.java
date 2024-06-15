/*
    Given a binary sorted matrix A of size N*N. Find the row with the maximum number of 1.
    If 2 rows have the maximum number of 1, then return the row with lower index.
    Each row is sorted.
 */
import java.util.*;

class OptimisedApproach{
    private List<ArrayList<Integer>> list;

    public OptimalApproach(List<ArrayList<Integer>> list){
        this.list = list;
    }

    public int solve(){
        int i=0, j=list.get(0).size()-1;
        int index=-1;
        while(i<list.size() && j>=0){
            // keep going towards left untill 1 is found.
            while(list.get(i).get(j)==1 && j>=0 ){
                j--;
                index = i;
            }
            // increment if 1 is not there, if any other row with more 1 is there
            // will be checked in above scenerio.
            i++;
        }
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

        OptimisedApproach bf = new OptimisedApproach(list);

        System.out.println("Rows with Max 1 = "+bf.returnIndex());
    }
}