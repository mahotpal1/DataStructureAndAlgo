
import java.util.ArrayList;
import java.util.HashMap;

public class Optimized1{
    public ArrayList<Integer> _number;

    public Optimized1(ArrayList<Integer> _num){
        this._number = _num;
    }

    public int getSolution(){
        return solve();
    }

    private int solve(){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < _number.size(); i++){
            map.put(_number.get(i), map.getOrDefault(_number.get(i), 0) + 1);
        }

        for(int i: _number){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }
}