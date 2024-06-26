import java.util.ArrayList;

public class MissingInteger{
    ArrayList<Integer> list;

    public MissingInteger(ArrayList<Integer> list){
        this.list = list;
    }

    public int getMissingInteger(){
        int n=1;
        for(int i=0; i<this.list.size(); i++){
            for(int j=0; j<this.list.size(); j++){
                if(n == this.list.get(j)){
                    n++;
                }
            }
        }
        return n;
    }

    public int optimisedApproach1(){
        boolean[] arr = new boolean[this.list.size()];
        for(int i=0; i<this.list.size(); i++){
            arr[i] = false;
        }
        for(int i=0; i<this.list.size(); i++){
            int ele = this.list.get(i);
            if(ele >= 1 && ele<=this.list.size()){
                arr[ele-1] = true;
            }
        }

        for(int i=0; i<this.list.size(); i++){
            if(arr[i] == false){
                return i+1;
            }
        }
        return this.list.size()+1;
    }

    public int optimisedApproach2(){
        for(int i=0; i<this.list.size(); i++){
            if(this.list.get(i) < 1){
                this.list.set(i, this.list.size()+2);
            }
        }
        System.out.println("Log 1");
        for(int i=0; i<this.list.size(); i++){
            int ele = this.list.get(i);
            if(ele >= 1 && ele<=this.list.size()){
                this.list.set(ele-1, -1*Math.abs(this.list.get(ele-1)));
            }
        }
        System.out.println("Log 2");
        for(int i=0; i<this.list.size(); i++){
            if(this.list.get(i) > 0) {
                return i + 1;
            }
        }
        System.out.println("Log 3");
        return this.list.size()+1;
    }
}