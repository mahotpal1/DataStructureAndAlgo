/*
	Problem 7 : A wire connects N light bulbs.
				Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
				Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
				You can press the same switch multiple times.
				Note: 0 represents the bulb is off and 1 represents the bulb is on.
*/

import java.util.*;
class Problem7{
	public static int bulb(ArrayList<Integer> A){
		int _count=0;
		for(int i=0; i<A.size(); i++){
			if(_count%2 == 0){
				if(A.get(i) == 0){
					_count++;
				}
			}else{
				if(A.get(i) == 1){
					_count++;
				}
			}
		}
		return _count;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(0, 1, 0, 1)
		);
		System.out.println("Total number of clicks : "+bulb(arr));
		return;
	}
}