package gfg.array;

import array.PrintArray;

public class ReverseArr {
	
	public static void main(String[] args) {
		
		int arr [] = {4,9,10,2,3,1,7,8};
		PrintArray.print(arr);
		function(arr);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr) {
		
		int j = arr.length -1;
		int i = 0;
		
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
