import java.util.*;

class Pattern5{
	// print the pattern as if odd place print *, if even print 2;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				if(j%2 != 0){
					System.out.print("*");
				}else{
					System.out.print("2");
				}
			}
			System.out.println();
		}
	}
}