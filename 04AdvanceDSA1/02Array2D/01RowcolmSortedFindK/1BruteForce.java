/*
	Brute Force Approach:

	• Iterate through each row
	• Iterate through each column
	• Find if arr[i][j] is same as of k. If present return index.
	  Return -1 if not found.
 */
import java.util.*;

class BruteForce{
    private List<ArrayList<Integer>> list;

    public BruteForce(List<ArrayList<Integer>> list){
        this.list = list;
    }

    public String findK(int k){
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(0).size(); j++){
                if(list.get(i).get(j) == k){
                    return "Found at "+i+", "+j;
                }
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(
                Arrays.asList(-5, 2, 1, 13)
        );
        ArrayList<Integer> list2 = new ArrayList<Integer>(
                Arrays.asList(-4, 0, 3, 14)
        );
        ArrayList<Integer> list3 = new ArrayList<Integer>(
                Arrays.asList(-3, 2, 6, 18)
        );
        List<ArrayList<Integer>> list = new ArrayList<>(
                Arrays.asList(list1, list2, list3)
        );

        BruteForce bf = new BruteForce(list);
        System.out.println("Element "+bf.findK(13));
        System.out.println("Element "+bf.findK(2));
        System.out.println("Element "+bf.findK(15));
    }
}