/*
	Print the subarray in given range.
*/
import java.util.*;

public class Main
{
    public static ArrayList<Integer> SubarrayInRange(ArrayList<Integer> arr, int a, int b){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=a; i<=b; i++){
            ans.add(arr.get(i));
        }
        return ans;
    }
    
	public static void main(String[] args) {
	    ArrayList<Integer> arr = new ArrayList<Integer>(
	        Arrays.asList(4, 3, 2, 6)    
	    );
	    System.out.println();
	    for(int x: SubarrayInRange(arr, 1, 3)){
	        System.out.print(x+" ");
	    }
	    System.out.println();
	    return;
	}
}
