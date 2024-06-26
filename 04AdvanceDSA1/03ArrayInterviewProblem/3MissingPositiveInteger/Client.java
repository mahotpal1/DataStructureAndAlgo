import java.util.*;

class Client{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(
                // Test Cases:
                 Arrays.asList(-3, -6, -3, -10)
                //Arrays.asList(-2, 4, -1, -6, 3, 7, 8, 4, -3, 1)
        );
        MissingInteger object = new MissingInteger(list);
        System.out.println("Missing Integer: " + object.getMissingInteger());
        System.out.println("Missing Integer using Optimised 1: " + object.optimisedApproach1());
        System.out.println("Missing Integer using Optimised 2: " + object.optimisedApproach2());
        return;
    }
}