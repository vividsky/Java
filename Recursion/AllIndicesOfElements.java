package Recursion;
import java.util.Arrays;

public class AllIndicesOfElements {
    public static void main(String[] args) {
        int[] arr = {4, 3, 3};
        int[] ans = allIndicesOfElements(arr, 0, 3, 0);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] allIndicesOfElements(int[] arr, int i, int ele,int count) {
        int[] base = null;
        if (i == arr.length){
            base = new int[count];
            return base;
        }

        if (arr[i] == ele) {
            base = allIndicesOfElements(arr, i + 1, ele, count + 1);
            base[count] = i;
        }
        else {
            base = allIndicesOfElements(arr, i + 1, ele, count);
        }
        return base;
    }
}
