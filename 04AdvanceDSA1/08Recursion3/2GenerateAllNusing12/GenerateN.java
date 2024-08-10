import java.util.ArrayList;
import java.util.List;

class GenerateN{
    private static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

    public static void printAll(ArrayList<Integer> lst, int i, int n){
        if(i == n){
            list.add(new ArrayList<>(lst.subList(0, 2)));
            //lst.clear();0, 2
            return;
        }
        // At ith index i’ve two choices
        lst.add(i, 1); // Choice 1
        printAll(lst, i+1, n);
        lst.add(i, 2); // Choice 2
        printAll(lst, i+1, n);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        printAll(arr, 0, 2);
        for(ArrayList<Integer> i: list){
            System.out.println(i);
        }
        return;
    }
}