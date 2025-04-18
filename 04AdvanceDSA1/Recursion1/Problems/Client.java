import java.util.*;

class Client{
    public static void main(String[] args) {
        // 1. Factorial
        Factorial ftr = new Factorial();
        System.out.println("Factorial of 10: " + ftr.solve(10));
        // 2. Nth Fibonnacci
        NFibonacci nf = new NFibonacci();
        System.out.println("Fibonacci Term at 6: " + nf.solve(10));
        // 3. Fast Power
        Power pw = new Power();
        System.out.println("Power of (2, 5) using 1st approach: " + pw.solvePower(2, 5));
        System.out.println("Power of (2, 5) using fast Power: " + pw.fastPower(2, 5));
    }
}