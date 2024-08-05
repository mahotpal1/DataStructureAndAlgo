
import java.util.ArrayList;
import java.util.HashMap;

public class Optimized2{
    public ArrayList<Integer> _number;

    public Optimized2(ArrayList<Integer> _num){
        this._number = _num;
    }

    public int getSolution(){
        return solve();
    }

    private int solve(){
        int ans=0;
        for(int i=0; i<_number.size(); i++){
            ans ^= _number.get(i);
        }

        return ans;
    }
}