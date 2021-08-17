package Arrays;

import java.util.*;

public class SumOfSubArray{
 
	public static void main(String[] args){
		int[] arr = {1, 1, 1, 1, 1};
		System.out.println(Arrays.toString(arr));
		int count = 0;
		int sum = 0;
		for (int ele : arr){
			if (sum + ele <= 3){
				sum += ele;
				if (sum == 3){
					count += 1;
					sum = 0;
				}
			}
			else{
				sum = ele;	
			}
		}
		System.out.println(count);
	}
}