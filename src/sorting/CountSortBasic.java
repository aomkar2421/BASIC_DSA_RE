package sorting;

import gfg.array.PrintArray;

public class CountSortBasic {
	public static void main(String[] args) {
		
		int [] arr = {5, 2, 7, 6, 3, 8, 1, 3, 10};
		PrintArray.print(arr);
		sort(arr);
		PrintArray.print(arr);

	}

	private static void sort(int[] arr) {

		int max = findMax(arr);
		int [] count = new int[max+1];
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		int k =0;
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i]; j++) {
				arr[k] = i;
				k++;
			}
		}
		
	}

	private static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
