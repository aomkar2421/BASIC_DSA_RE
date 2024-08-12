package sorting;

import gfg.array.PrintArray;

public class SelectionSort {
	public static void main(String[] args) {
		
		int [] arr = {76,98,3,9,21,34,8,1,44};
		PrintArray.print(arr);
		sort(arr);
		PrintArray.print(arr);
		
	}

	private static void sort(int[] arr) {

		int minIdx;
		int temp;
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			minIdx = i;
			
			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			
			if(minIdx != i) {  // if minimum element index is same as i then dont need to swap
				temp = arr[minIdx];
				arr[minIdx] = arr[i];
				arr[i] = temp;
			}
			
		}
		
	}
}
