import java.util.ArrayList;
import java.util.List;

class Subsets{
    private static List<ArrayList<Integer>> list = new ArrayList<>();
    public static void subsets(ArrayList<Integer> curr, ArrayList<Integer> arr, int i){
        if(i == arr.size()){
            list.add(new ArrayList<>(curr));
            return;
        }
        subsets(curr, arr, i+1);  // Exclude current element
        curr.add(arr.get(i));    // Include current element
        subsets(curr, arr, i+1); // Recursive call
        curr.remove(curr.size()-1); // Backtrack
    }

    public static void main(String[] args) {
        // Example array
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // Current subset
        ArrayList<Integer> curr = new ArrayList<>();

        // Call the subsets method
        subsets(curr, arr, 0);

        // Print all the generated subsets
        System.out.println("All Subsets:");
        for (ArrayList<Integer> subset : list) {
            System.out.println(subset);
        }
    }
}

/*
Breakdown of the Function
Parameters:

curr: The current subset being constructed.
arr: The original array from which subsets are being formed.
i: The current index in arr.
Base Case:

The base case is reached when i is equal to the size of the array arr.
At this point, the current subset curr is added to the list of all subsets.
list.add(new ArrayList<>(curr)); ensures a new copy of the current subset is added, so that further modifications to curr do not affect the stored subset.
Recursive Calls:

subsets(curr, arr, i+1);: This call is made without including the current element arr[i] in the subset. It explores the possibility of excluding the current element.
curr.add(arr.get(i));: The current element arr[i] is added to the subset, indicating the choice to include this element in the current subset.
subsets(curr, arr, i+1);: This call is made after including the current element, exploring the possibility of including the current element.
curr.remove(curr.size() - 1);: This line is crucial for backtracking. After exploring the subset with the current element, this line removes the last element added to the subset, allowing the function to backtrack and explore other possibilities without the current element.
 */