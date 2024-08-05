
import java.util.ArrayList;

public class BruteForce{
    public ArrayList<Integer> _number;

    public BruteForce(ArrayList<Integer> _num){
        this._number = _num;
    }

    public int getSolution(){
        return solve();
    }

    private int solve(){
        for(int i=0; i<this._number.size(); i++){
            boolean notFound = false;
            for(int j=0; j<this._number.size(); j++){
                if(i == j){
                    continue;
                }
                if(this._number.get(i) == this._number.get(j)){
                    notFound = false;
                    break;
                }else{
                    notFound = true;
                }
            }
            if(notFound){
                return this._number.get(i);
            }
        }
        return -1;
    }
}