/*
    Given a matrix of N rows and M columns. Determine the sum of all possible sub matrices.
 */
import java.util.*;

class OptimisedApproach{
    public int solve(List<ArrayList<Integer>> list){
        int sum=0;
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(i).size(); j++){
                int tl = (i+1)*(j+1);
                int br = (list.size()-i)*(list.get(i).size()-j);
                sum += tl*br*list.get(i).get(j);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(
                Arrays.asList(1,2)
        );
        ArrayList<Integer> list2 = new ArrayList<Integer>(
                Arrays.asList(3, 4)
        );
        ArrayList<Integer> list3 = new ArrayList<Integer>(
                Arrays.asList(5, 6)
        );
        List<ArrayList<Integer>> list = new ArrayList<>(
                Arrays.asList(list1, list2, list3)
        );

        OptimisedApproach obj = new OptimisedApproach();
        System.out.println(obj.solve(list));
    }
}
