/*
    Using carryForward store in a sum var
 */
import java.util.*;

class CarryForward{
    ArrayList<Integer> my_array;

    public CarryForward(ArrayList<Integer> my_array){
        this.my_array = my_array;
    }

    public int returnMaxSum(){
        int ans=this.my_array.get(0);
        for(int i=0; i<this.my_array.size(); i++){
            int sum=0;
            for(int j=i;j<this.my_array.size(); j++) {
                sum += this.my_array.get(j);
                if (sum > ans) {
                    ans = sum;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        CarryForward cr = new CarryForward(new ArrayList<Integer>(
                Arrays.asList(-2, 3, 4, -1, 5, -10, 7)
        ));
        System.out.println(cr.returnMaxSum());
    }
}