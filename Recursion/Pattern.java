package Recursion;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int column = 0;
        pattern(n, row, column);
    }
    public static void pattern(int n, int row, int column) {
        if (row == n) return;
        if (column == row) {
            System.out.println();
            pattern(n, row + 1, 0);
        } else {
            System.out.print("* ");
            pattern(n, row, column + 1);
        }
    }
}
