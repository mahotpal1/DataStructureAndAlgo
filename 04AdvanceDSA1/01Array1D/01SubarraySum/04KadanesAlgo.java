/*
    Use kadanes Algorithm
 */
import java.util.*;

class KadanesAlgo{
    ArrayList<Integer> my_array;

    public KadanesAlgo(ArrayList<Integer> my_array){
        this.my_array = my_array;
    }

    // Kadanes algorithm
    public int returnMaxSum(){
        int ans=this.my_array.get(0), tracker=0;
        for(int i=0; i<this.my_array.size(); i++){
            tracker = tracker+this.my_array.get(i);
            if(ans<tracker){
                ans = tracker;
            }
            if(tracker<0){
                tracker = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        KadanesAlgo kd = new KadanesAlgo(new ArrayList<Integer>(
                Arrays.asList(-2, 3, 4, -1, 5, -10, 7)
        ));
        System.out.println(kd.returnMaxSum());
    }
}