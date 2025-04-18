public class Power{
    public int solvePower(int a, int N){
        if(N == 0){
            return 1;
        }
        return a*solvePower(a, N-1);
    }

    public int fastPower(int a, int N){
        if(N == 0){
            return 1;
        }
        if(N%2 == 0){
            return fastPower(a, N/2)*fastPower(a, N/2);
        }else{
            return a*fastPower(a, N/2)*fastPower(a, N/2);
        }
    }
}