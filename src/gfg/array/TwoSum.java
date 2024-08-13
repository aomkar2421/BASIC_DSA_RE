package gfg.array;

import java.util.HashSet;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int arr [] = { 1, 4, 45, 6, 10, 8 };
		int n = 49;
		PrintArray.print(arr);
		function(arr,n);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr, int n) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			int val = n - arr[i];
			if (hs.contains(val)) {
				System.out.println(arr[i]+" & "+val);
			}
			hs.add(arr[i]);
		}

	}
	
}
