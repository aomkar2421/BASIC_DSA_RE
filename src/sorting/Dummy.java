package sorting;

import gfg.array.PrintArray;

public class Dummy {
	public static void main(String[] args) {

		int [] arr = {5, 2, 7, 6, 3, 8, 1};
		PrintArray.print(arr);
		quicksort(arr, 0, arr.length-1);
		PrintArray.print(arr);

	}


	private static void quicksort(int[] arr, int st, int end) {
		
		if (st>=end) {
			return;
		}
		
		int pt = partition(arr, st, end);
		
		quicksort(arr, st, pt-1);
		quicksort(arr, pt+1, end);
		
	}

	private static int partition(int[] arr, int st, int end) {
		
		int count = 0;
		int pivot = arr[st];
		
		for (int i = st+1; i <= end; i++) {
			if(arr[i] <= pivot) {
				count++;
			}
		}
		
		int pivotIdx = st+count;
		swap(arr, st, pivotIdx);
		
		int i = st, j = end;
		while (i<pivotIdx && j>pivotIdx) {
			if(arr[i] < arr[pivotIdx]) {
				i++;
			}
			else if (arr[j] > arr[pivotIdx]) {
				j--;
			}else {
				swap(arr, i, j);
				i++;
				j--;
			}
		}

		return pivotIdx;
	}
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
