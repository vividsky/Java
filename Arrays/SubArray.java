package Arrays;

import java.util.*;

class SubArray{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int count = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++){
			arr[i] = input.nextInt();
		}
		long[] prefix = new long[n + 1];
		for (int i = 0; i < n; i++){
			prefix[i + 1] = prefix[i] + arr[i];
		}
		for (int i = 0; i < n; i++){
			if (toFind(prefix, k, i, n)){
				count++;
			}
		}
		System.out.println(count);
	}
	private static boolean toFind(long[] prefix, int k, int i, int n){
		int low = i, high = n;
		while (low <= high){
			int mid = (low + high)/2;
			if(prefix[mid] == prefix[i] + k){
				return true;
			}
			if (prefix[mid] < prefix[i] + k){
				low = mid + 1;
			}else{
				high = mid - 1;
				}
		}
		return false;
	}
}