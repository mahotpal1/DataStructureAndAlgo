/*
	Q6. Print Matrix in waveform
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
	// Function to Print waveform
	public static void printWave(int[][] arr, int row, int col){
		for(int i=0; i<row; i++){
			if(i%2 == 0){
				for(int j=0; j<col; j++){
					System.out.print(arr[i][j]+" ");
				}
			}else{
				for(int j=col-1; j>=0; j--){
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		return;
	}
	
	public static void main(String[] args){
		int[][] arr  = new int[3][3];
		
		fillArray(arr, 3, 3);
		
		printWave(arr, 3, 3);
		
		return;
	}
}