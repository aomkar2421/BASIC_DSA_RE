package gfg;

import array.PrintArray;

public class KSmall {
	// use bubble sort and kth small or large index will arrive on arr.length-k index
	public static void main(String[] args) {
		
		int [] arr = {76,98,3,9,21,34,8,1,44};
		int k = 3;
		PrintArray.print(arr);
		function(arr,k);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr, int k) {
		
		int temp;
		
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] < arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(arr[arr.length-k]);
	}
	
}
