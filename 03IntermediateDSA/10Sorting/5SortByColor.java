/*
    Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will represent the colors as,

red -> 0
white -> 1
blue -> 2

Note: Using the library sort function is not allowed.
 */


import java.util.*;

class MyClass{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>(
                Arrays.asList(0, 1, 2, 0, 1, 2)
        );

        Collections.sort(arr);
        System.out.println(arr);
        return;
    }
}