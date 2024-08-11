package gfg.array;

import array.PrintArray;

public class RotateArray2 {
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6};
		int k = 1;
		PrintArray.print(arr);
		function(arr, k);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr, int k) {
		int n = arr.length;
		k = k%n;
		
		reverseArray(arr, 0, n-k-1);
		reverseArray(arr, n-k, n-1);
		reverseArray(arr, 0, n-1);
		
	}
	
	 static void reverseArray(int [] arr, int i, int j){
		
		int temp;
		while(i<j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
			i++;
		}
		
	}
	
}
