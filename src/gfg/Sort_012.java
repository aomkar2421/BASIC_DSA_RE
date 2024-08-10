package gfg;

import array.PrintArray;

public class Sort_012 {
	
	public static void main(String[] args) {
		
		int arr [] = {2,0,1,2,2,0,0,1,1,2,0,2};
		PrintArray.print(arr);
		function(arr);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr) {
		
		int l=0,m=0,r=arr.length-1;
		
		while (m<=r) {
			if(arr[m] == 0) {
				swap(arr, l, m);
				l++;
				m++;
			}
			else if (arr[m] == 1) {
				m++;
			}
			else {
				swap(arr, m, r);
				r--;
			}
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
