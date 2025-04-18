/* Find factorial of a given input N */

public class Factorial{
    public int solve(int N){
        if(N == 1){
            return 1;
        }
        return N*solve(N-1);
    }
}