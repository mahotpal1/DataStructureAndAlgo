import java.util.*;

class pattern8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--){
			System.out.print("*");
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		return;
	}
}