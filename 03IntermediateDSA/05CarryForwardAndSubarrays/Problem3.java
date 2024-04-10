/*
	Problem3 : Find total possible Special Subsequence "AG", In the given string str
*/

import java.util.*;

class Problem3{
	//Function to track count of AG pairs
	public static int countAG(String str){
		int count_of_g = 0;
		int count_of_ag = 0;
		for(int i=str.length()-1; i>=0; i--){
			if(str.charAt(i) == 'G'){
				count_of_g++;
			}else if(str.charAt(i) == 'A'){
				count_of_ag += count_of_g;
			}
		}
		return count_of_ag;
	}
	
	public static void main(String[] args){
		String str = "ABCGAG";
		System.out.println("Total count of AG pairs in Given String : " + countAG(str));
		return;
	}
}