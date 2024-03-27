import java.util.*;

class CountFactors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int _num = sc.nextInt();
		int count = 0;
		for(int i=1; i*i<=_num; i++){
			if(_num%i == 0){
				if(i == _num/i){
					count +=1;
				}else{
					count += 2;
				}
			}
		}
		System.out.println(count);
	}
}