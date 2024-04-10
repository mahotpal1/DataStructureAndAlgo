/*
	Problem5 : You are given a string S, and you have to find all the amazing substrings of S. An amazing Substring is one 
	           that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
*/

import java.util.*;

class Problem5{
	// Function to check whether character is vowel or not
	public static boolean isVowel(char a){
		if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U' || a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ){
			return true;
		}
		return false;
	}
	// Function to track all possible substrings
	public static int possibleAmazingSubstrings(String str){
		int possible=0;
		for(int i=0; i<str.length(); i++){
			if(isVowel(str.charAt(i))){
			    // Add all possible substrings with index character if it is a vowel
				possible += str.length()-i;
			}
		}
		return possible;
	}
	
	public static void main(String[] args){
		String str = "ABEC";
		System.out.println("Total possible amazing substrings for given string : " + possibleAmazingSubstrings(str));
		return;
	}
}