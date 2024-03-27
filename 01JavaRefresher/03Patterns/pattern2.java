import java.util.*;

class Pattern2{
    // print n*n grid of *
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}