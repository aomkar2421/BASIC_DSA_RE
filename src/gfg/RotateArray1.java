package gfg;

import array.PrintArray;

public class RotateArray1 {
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6};
		int k = 2;
		PrintArray.print(arr);
		function(arr, k);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr, int k) {
		int n = arr.length;
		int arr2 [] = new int[n];
		int idx = 0;
		
		for(int i = n-k; i < n; i++) {
			arr2[idx++] = arr[i];
		}
		
		for(int i = 0; i < n-k; i++) {
			arr2[idx++] = arr[i];
		}
		
		PrintArray.print(arr2);
	}
	
}
