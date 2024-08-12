package sorting;

import gfg.array.PrintArray;

public class RedixSort {
	public static void main(String[] args) {
		
		int [] arr = {16, 51, 101, 409, 154, 249};
		PrintArray.print(arr);
		Redixsort(arr);
		PrintArray.print(arr);

	}

	private static void Redixsort(int[] arr) {
		int max = findMax(arr);
		
		for (int place = 1; max/place > 0; place=place*10) {
			countSort(arr, place);
		}
		
	}

	private static void countSort(int[] arr, int place) {

		int [] count = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			count[ (arr[i]/place)%10 ]++;
		}
		
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i-1];
		}
		
		int [] output = new int[arr.length];
		
		for (int i = arr.length-1 ; i >=0; i--) {
			int idx = count[ (arr[i]/place)%10 ] - 1;
			output[idx] = arr[i];
			count[(arr[i]/place)%10]--;
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
