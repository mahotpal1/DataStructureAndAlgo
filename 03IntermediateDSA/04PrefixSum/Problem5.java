/*
	Problem 5 :
	Given an array of integers A, find and return the product array of the same size where the 
	ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
	
	Note: It is always possible to form the product array with integer (32 bit) values. 
	Solve it without using the division operator.
*/

class Problem5{
	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<Integer>(
			Arrays.asList(1, 2, 3, 4, 5)
		);
		int ans = arr.get(0);
		for(int i=1; i<arr.size(); i++){
			ans *= arr.get(i);
		}
		for(int i=0; i<arr.size(); i++){
			arr.set(i, ans/arr.get(i));
		}
		System.out.println("After performing the operation array elements are : ");
		for(int x: arr){
			System.out.print(x + " ");
		}
		return;
	}
}