import java.util.*;

class CountOfPrimes{
	public static boolean isPrime(int _num){
		if(_num == 1){
			return false;
		}
		for(int i=2; i*i<=_num; i++){
			if(_num%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int _num = sc.nextInt();
		int count=0;
		for(int i=1; i<=_num; i++){
			if(isPrime(i)){
				count++;
			}
		}
		System.out.println(count);
	}
}