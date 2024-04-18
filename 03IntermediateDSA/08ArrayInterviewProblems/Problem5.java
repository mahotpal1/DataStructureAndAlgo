/*
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.
If there are multiple solutions, return any one.
Note: Read-only array means that the input array should not be modified in the process of solving the problem
*/

import java.util.*;

class Problem3 {
    public static int getMajority(ArrayList<Integer> arr){
        long _count1=0, _count2=0;
        int _maj1 = -1, _maj2=-2;
        for(int i=0; i<arr.size(); i++){
            if((_count1==0 && arr.get(i)!=_maj2)||arr.get(i)==_maj1){
                _maj1=arr.get(i);
                _count1++;
            }else if((_count2==0 && arr.get(i)!=_maj1)||arr.get(i)==_maj2){
                _maj2=arr.get(i);
                _count2++;
            }else{
                _count1--;
                _count2--;
            }
        }
        _count1=0;_count2=0;
        for(int x: arr){
            if(x == _maj1){
                _count1++;
            }
            if(x == _maj2){
                _count2++;
            }
        }
        if(_count1 > (arr.size()/3)){
            return _maj1;
        }
        if(_count2 > (arr.size()/3)){
            return _maj2;
        }
        return -1;
    } 
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(
            Arrays.asList(2, 1, 6, 2, 4, 4, 2));
        
        System.out.println("Majority Element = "+getMajority(arr));
        return;
    }
}