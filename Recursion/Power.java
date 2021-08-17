package Recursion;

public class Power {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        System.out.println(power(2, 5));
    }
    public static int power(int n, int m) {
        if (m == 1) return n;
        return n * power(n, m - 1);
    }
}
