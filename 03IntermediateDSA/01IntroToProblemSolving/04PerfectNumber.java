import java.util.*;

class PerfectNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int _num = sc.nextInt();
		if(_num ==1){
			System.out.println("IsPrime : 0");
		}
		int count=1;
		for(int i=2; i*i<_num; i++){
			if(_num%i == 0){
				if(i == _num/i){
					count += i;
				}else{
					count += i + _num/i;
				}
			}
		}
		System.out.println("IsPerfect : "+((count==_num)?1:0));
	}
}
