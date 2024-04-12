/*
    Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and
    return the generated square matrix.
 */

import java.util.*;

class MyPop{
    public static void printMax(int A){
        int i=0, j=0, n=1;
        int size = A;
        int[][] arr = new int[A][A];
        while(size>1){
            for(int k=1; k<size; k++){
                arr[i][j] = n;
                j++;
                n++;
            }
            for(int k=1; k<size; k++){
                arr[i][j] = n;
                i++;
                n++;
            }
            for(int k=1; k<size; k++){
                arr[i][j] = n;
                j--;
                n++;
            }
            for(int k=1; k<size; k++){
                arr[i][j] = n;
                i--;
                n++;
            }
            i++; j++;
            size -= 2;
        }
        if(size == 1){
            arr[i][j] = n;
        }

        for(int t=0; t<A; t++){
            for(int p=0; p<A; p++){
                System.out.print(arr[t][p]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printMax(4);
        return;
    }
}