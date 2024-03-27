import java.util.*;

class SquareRoot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int _num = sc.nextInt();
		for(int i=1; i*i<=_num; i++){	
			if(i*i == _num){
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
		return;
	}
}