package SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(insertionSort(arr, n)));
    }
    public static int[] insertionSort(int[] arr, int n) {
        int counter = 1;
        while (counter < n) {
            int val = arr[counter];
            int i = counter - 1;
            while (i > -1 && arr[i] > val) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = val;
            counter++;
        }
        return arr;
    }
}
