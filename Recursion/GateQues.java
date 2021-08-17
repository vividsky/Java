package Recursion;

public class GateQues {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(f(n));
    }
    public static int f(int n) {
        int r = 0;
        if ( n <= 0) return 1;
        if (n > 3) {
            n = r;
            return f(n - 2) + 2;
        }
        return f(n - 1) + r;
    }
}
