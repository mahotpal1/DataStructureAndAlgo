/*
Given the string, print the count of special characters
 */

import java.util.*;

class MyClass{
    public static void countSpecial(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)>=32 && str.charAt(i)<=47) || (str.charAt(i)>=58 && str.charAt(i)<=64) || (str.charAt(i)>=91 && str.charAt(i)<=96) || (str.charAt(i)>=123 && str.charAt(i)<=126)){
                count++;
            }
        }
        System.out.println("Count of uppercase is "+count);
    }

    public static void main(String[] str){
        String st = "My#World";
        countSpecial(st);
        return;
    }
}