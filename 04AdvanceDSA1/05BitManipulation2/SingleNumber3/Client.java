/*
  Given an array, all elements will occur twice
  except two elements find the two elements
 */

import java.util.*;
public class Client{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(2, 3, 5, 6, 3, 7, 6, 2)
        );

        Optimized3 bf = new Optimized3(list);
        bf.getSolution();
        //System.out.println(bf.getSolution());

        return;
    }
}