package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        BubbleSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void BubbleSort(int[] arr, int i, int j) {
        if (j == 0) return;
        if (i == j) {
            BubbleSort( arr, 0, j - 1);
            return;
        }
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
        BubbleSort(arr, i + 1, j);
    }
}
