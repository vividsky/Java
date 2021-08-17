package DP;

import java.util.*;

public class Factorial {
    static HashMap<Integer, Double> dict = new HashMap();
    public static void main(String[] args) {
        for(int i = 2; i < 101; i++) {
            factorial(i);
        }
        System.out.println(dict.get(100));
    }

    public static Double factorial(int n) {
        if (n == 0 || n == 1) return 1D;
        if (dict.containsKey(n)) {
            return dict.get(n);
        }
        double val = n * factorial(n - 1);
        dict.put(n, val);
        return val;
    }

}
