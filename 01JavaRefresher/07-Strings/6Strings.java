/*
Given the string, check whether palindrom
 */

import java.util.*;

class MyClass{
    public static String checkPalindrome(String str){
        int start =0, end=str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return "No";
            }
            start++;
            end--;
        }
        return "Yes";
    }

    public static void main(String[] str){
        String st = "nun";
        System.out.println("Is the given string palindrome : "+checkPalindrome(st));
        return;
    }
}