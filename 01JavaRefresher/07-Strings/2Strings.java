/*
Given a string, print the ascii of its characters in new line
 */

import java.util.*;

class MyClass{
    public static void printAscii(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println((int)str.charAt(i));
        }
    }

    public static void main(String[] args){
        String str = "India";
        printAscii(str);
        return;
    }
}