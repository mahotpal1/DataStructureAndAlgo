/*
    • Start form top right element
	• If element is less than the target element, increment i++ else decrement j--
	• Drop case we will keep where i becomes n and j becomes 0.
 */
import java.util.*;

class OptimisedApproachZigZag {
    private List<ArrayList<Integer>> list;

    public OptimisedApproachZigZag(List<ArrayList<Integer>> list) {
        this.list = list;
    }

    public String findK(int k){
        int i=0, j=this.list.get(0).size()-1;

        while(i<this.list.size() && j>=0){
            if(this.list.get(i).get(j)==k){
                return "Element found at "+i+", "+j;
            }else if(this.list.get(i).get(j)<k){
                i++;
            }else{
                j--;
            }
        }
        return "Element not found!!";
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

        OptimisedApproachZigZag bf = new OptimisedApproachZigZag(list);
        System.out.println("Element "+bf.findK(13));
        System.out.println("Element "+bf.findK(2));
        System.out.println("Element "+bf.findK(15));

        return;
    }
}