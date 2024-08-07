import java.util.*;

class Client{
    public static void TOH(int N, char A, char B, char C){
        if(N == 0){
            return;
        }
        TOH(N-1, A, C, B);
        System.out.print(N + " moved from " + A + " to " + C + "\n");
        TOH(N-1, B, C, A);
    }
    public static void main(String[] args) {
        int n=3;
        char A='A';
        char B='B';
        char C='C';
        TOH(n, A, B, C);
    }
}