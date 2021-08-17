package Recursion;

public class PrintingNumbers {
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
    public static void printNumbers(int n) {
        if (n == 0) return;
        if (n % 2 != 0) System.out.println(n);
        printNumbers(n - 1);
        if (n % 2 == 0)System.out.println(n);
    }
}
