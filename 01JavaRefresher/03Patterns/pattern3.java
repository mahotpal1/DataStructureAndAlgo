import java.util.*;

class Pattern3{
	// Print a grid of n*m
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
}