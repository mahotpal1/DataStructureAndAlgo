import java.util.*;

class IsPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int _num = sc.nextInt();
		
		if(_num == 1){
			System.out.println("1 is not a prime number!!");
			return;
		}
		
		boolean flag=false;
		for(int i=2; i*i<=_num; i++){
			if(_num%i == 0){
				flag=true;
			}
		}
		if(flag){
			System.out.println(_num+" is not a prime number!!");
		}
		else{
			System.out.println(_num+" is a prime number!!");
		}
		return;
	}
}