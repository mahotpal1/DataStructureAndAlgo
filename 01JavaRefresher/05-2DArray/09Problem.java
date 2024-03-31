/*
	Q9. Print Col wise max
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
	// Function to Print Col wise max
	public static void printColWiseMax(int[][] arr, int row, int col){
		for(int i=0; i<row; i++){
			int max=Integer.MIN_VALUE;
			for(int j=0; j<col; j++){
				if(max<arr[j][i]){
					max = arr[j][i];
				}
			}
			System.out.print(max+" ");
		}
		return;
	}
	
	public static void main(String[] args){
		int[][] arr  = new int[3][3];
		
		fillArray(arr, 3, 3);
		
		printColWiseMax(arr, 3, 3);
		
		return;
	}
}