/*
    Kth Symbol
    Each row is generated by replacing all elements of the previous row.
        1 -> 1 0
        0 -> 0 1
 */
class KSymbol{
    public static void main(String[] args) {
        System.out.println("For 5th row 9th element: " +  find(5, 9));
        System.out.println("For 5th row 11th element: " +  find(5, 11));
        return;
    }

    public static int find(int n, int k){
        if(k == 0){
            return 0;
        }
        if(k%2 == 0){
            return find(n-1, k/2);
        }else{
            return 1-find(n-1, k/2);
        }
    }
}