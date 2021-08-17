package BinarySearch;

import java.util.Scanner;

public class BinarySearch{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("value of n:");
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("value of arr:");
			arr[i] = input.nextInt();
		}
		System.out.println("value of k:");
		int k = input.nextInt();
		boolean result = isResult(n, arr, k);
		
		System.out.println(isResult(n, arr, k) ? "Yes" : "No");
	}
	private static boolean isResult(int n, int[] arr, int k){
		int low  = 0, high = n-1;
		boolean result = false;
		while (low <= high){
			int mid = (low + high)/2;
			if (arr[mid] == k){
				result = true;
				break;
			}
			if (k > arr[mid]){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return result;
	}
}
