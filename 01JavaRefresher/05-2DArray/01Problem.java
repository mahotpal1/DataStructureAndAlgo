/*
	Q1. Print top row of matrix
*/

import java.util.*;

class Problem1{
	// Function to fill array with elemnts
	public static int[][] fillArray(int[][] arr, int row, int col){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	// Function to display array elements 
	public static void print(int[][] arr, int row, int col){
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(arr[i][j]+" ");
			}
		}
		return;
	}
	// Function to display top row of array
	public static void printTopRow(int[][] arr, int row, int col){
		// column keeps on changing row no is fixed. 
		for(int i=0; i<col; i++){
			System.out.print(arr[0][i]);
		}
	}
	
	public static void main(String[] args){
		int[][] arr  = new int[3][3];
		
		fillArray(arr, 3, 3);
		
		printTopRow(arr, 3, 3);
		
		return;
	}
}