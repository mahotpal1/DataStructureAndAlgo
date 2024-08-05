
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
        // Do xor all the elements
        int xorAll = 0;
        for(int i=0; i<_number.size(); i++){
            xorAll ^= _number.get(i);
        }

        // Find first set bit in xorAll
        int pos = 0;
        for(int i=0; i<32; i++){
            if((xorAll & (1<<i)) > 0){
                pos = 1;
                break;
            }
        }

        // Divide the array element keeping pos as a reference
        int leftXor=0, rightXor=0;

        for(int i=0; i<_number.size(); i++){
            if((_number.get(i) & (1<<pos)) > 0){
                leftXor ^= _number.get(i);
            }else{
                rightXor ^= _number.get(i);
            }
        }
        System.out.println("1st element: "+leftXor);
        System.out.println("2nd Element: "+rightXor);
        return 0;
    }
}