package sorting;

import array.PrintArray;

public class Insertion {
	public static void main(String[] args) {
		
		int [] arr = {76,98,3,9,21,34,8,1,44};
		PrintArray.print(arr);
		sort(arr);
		PrintArray.print(arr);

	}

	private static void sort(int[] arr) {

		int n = arr.length;
		int temp;
		
		for (int i = 1; i < n; i++) {
			int j = i;
			while (j>0 && arr[j-1] > arr[j]) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp; 
				j--;
			}
		}
		
	}
}
