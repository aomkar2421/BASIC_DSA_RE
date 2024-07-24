package sorting;

import array.PrintArray;

public class CountSort {
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
		PrintArray.print(count);
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i-1];
		}
		PrintArray.print(count);
		
		int [] output = new int[arr.length];
		
		for (int i = arr.length-1 ; i >=0; i--) {
			int idx = count[arr[i]] - 1;
			output[idx] = arr[i];
			count[arr[i]]--;
		}
		
		for (int i = 0; i < output.length; i++) {
			arr[i] = output[i];
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
