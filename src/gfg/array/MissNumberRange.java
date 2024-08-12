package gfg.array;

import gfg.array.PrintArray;

public class MissNumberRange {
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,6,7,8};
		PrintArray.print(arr);
		function(arr);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr) {
		
		int sum = 0;
		int n = arr.length+1;
		
		for (int i = 0; i < n-1; i++) {
			sum = sum + arr[i];
		}
		
		int expectedSum = (n*(n+1))/2;
		
		System.out.println(expectedSum-sum);

	}
	
}
