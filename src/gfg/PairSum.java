package gfg;

import java.util.Arrays;

import array.PrintArray;

public class PairSum {
	
	public static void main(String[] args) {
		
		int arr [] = {1,5,7,-1,4,2};
		PrintArray.print(arr);
		int sum = 6;
		function(arr,sum);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr, int sum) {
		int n = arr.length;
		int count = 0;
		Arrays.sort(arr);

		for(int i=0; i<n-1;i++) {
			int val = sum - arr[i];
			
			int j=i+1, k=n-1;
			
			while (j<=k) {
				int m = j+(k-j)/2;
				
				if(arr[m] == val) {
					count++;
					break;
				}
				else if (arr[m] > val) {
					k=m-1;
				}
				else if (arr[m] < val) {
					j=m+1;
				}
			}
			
		}
		System.out.println(count);
	}
	
}
