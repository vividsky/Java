package Recursion;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = {2,6, 9};
        int max = arr[0];
        int i = 1;
        System.out.println(isSorted(max, arr, i));
    }
    public static boolean isSorted(int max, int[] arr, int i) {
        if (i == arr.length - 1) return true;
        if (arr[i] < max) return false;
        max = arr[i];
        return isSorted(max, arr, i + 1);
    }
}
