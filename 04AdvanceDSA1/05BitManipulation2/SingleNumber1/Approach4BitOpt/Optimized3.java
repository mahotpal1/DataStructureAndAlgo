
import java.util.ArrayList;
import java.util.HashMap;

public class Optimized3{
    public ArrayList<Integer> _number;

    public Optimized3(ArrayList<Integer> _num){
        this._number = _num;
    }

    public int getSolution(){
        return solve();
    }

    private int solve(){
        int ans=0;
        for(int i=0; i<32; i++){
            int cnt = 0;
            for(int j=0; j<_number.size(); j++){
                if(_number.get(j) & (1<<i) > 0){
                    cnt++;
                }
            }
            if(cnt & 1){
                ans = ans | (1<<i);
            }
        }

        return ans;
    }
}