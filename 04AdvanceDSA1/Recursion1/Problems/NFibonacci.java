public class NFibonacci{
    public int solve(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return solve(n-1)+solve(n-2);
    }
}