package SortingAlgorithms;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println('a' * 4);
        System.out.println(Arrays.toString(bubbleSort(arr, n)));
    }
    public static int[] bubbleSort(int[] arr, int n) {
        int counter = n;
        while (counter-- > 0) {
            for (int i = 0; i <  counter; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

}
