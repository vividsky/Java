package Arrays;

public class WaveForm {
    public static void main(String[] args) {
        int[][] arr = {{11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}};
        spiral(arr);
    }

    public static void spiral(int[][] arr) {
        int left = 0, right = 3, top = 0, bottom = 3, count = 16, dir = 1;
        while (count > 0) {
            if (dir == 1) {
                for (int i = left; i <= right; i++) System.out.print(arr[top][i] + " ");
                top++;
                dir = 2;
            }
            if (dir == 2) {
                for (int i = top; i <= bottom; i++) System.out.print(arr[i][right] + " ");
                right--;
                dir = 3;
            }
            if (dir == 3) {
                for (int i = right; i >= left; i--) System.out.print(arr[bottom][i] + " ");
                bottom--;
                dir = 4;
            }
            if (dir == 4) {
                for (int i = bottom; i >= top; i--) System.out.print(arr[i][left] + " ");
                left++;
                dir = 1;
            }
            count--;
        }
    }

    public static void wavyForm(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int j = 3; j > -1; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
