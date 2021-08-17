package Recursion;

public class FindFirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,7,3};
        int index = -1;
        System.out.println(lastOccurence1(arr, 0, 3, index));
    }
    public static int lastOccurence1(int[] arr, int i, int ele, int index) {
        if (i == arr.length) return index;
        if (arr[i] == ele) index = i;
        return lastOccurence1(arr, i + 1, ele, index);
    }
    public static int lastOccurence2(int[] arr, int i, int ele) {
        if (i == arr.length) return -1;
        int index = lastOccurence2(arr, i + 1, ele);
        if (index == -1) {
            if (arr[i] == ele) {
                return i;
            }
            else return -1;
        }
        else return index;
    }
}
