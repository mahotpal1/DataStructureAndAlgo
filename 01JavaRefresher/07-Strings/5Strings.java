/*
Given the string, return the reverse string
 */

import java.util.*;

class MyClass{
    public static void reverse(String str){
        byte[] strAsByteArray = str.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println(new String(result));
    }

    public static void main(String[] str){
        String st = "My#World";
        reverse(st);
        return;
    }
}