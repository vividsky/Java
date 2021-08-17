package SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(selectionSort(arr, n)));
    }
    public static int[] selectionSort(int[] arr, int n) {
        int counter = 0;

        while (counter < n) {
            int min = counter;
            for (int i = counter + 1; i < n; i++) {
                if (arr[min] > arr[i]) min = i;
            }
            int temp = 0;
            temp = arr[counter];
            arr[counter] = arr[min];
            arr[min] = temp;
            counter++;
        }
        return arr;
    }
}
