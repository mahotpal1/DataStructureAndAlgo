import java.util.*;
public class Client{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(2, 3, 5, 6, 3, 6, 2)
        );

        Optimized1 bf = new Optimized1(list);

        System.out.println(bf.getSolution());

        return;
    }
}