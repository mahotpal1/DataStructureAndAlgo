/*
Given the string, print the count of uppercase characters
 */

import java.util.*;

class MyClass{
    public static void countUppercase(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Count of uppercase is "+count);
    }

    public static void main(String[] str){
        String st = "My World";
        countUppercase(st);
        return;
    }
}