/*
    Given a String, print characters in a new line.
 */

import java.util.*;

class PrintStrings{
    public static void print(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args){
        String str = "India";
        print(str);
        return;
    }
}