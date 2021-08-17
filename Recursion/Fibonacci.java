package Recursion;

import java.util.HashMap;

public class Fibonacci {

    public static void main(String[] args) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        System.out.println(fibonacci(5, cache));
    }
    public static int fibonacci(int n, HashMap cache) {
        if (n == 0 || n == 1) return n;
        if (cache.containsKey(n)) {
            int n1 = (int) cache.get(n);
        } else {
            int n1 = fibonacci(n - 1, cache);
            cache.put(n, n1);
        }
        return fibonacci(n - 1, cache) + fibonacci(n - 2, cache);
    }
}
