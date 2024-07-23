package sorting;

import array.PrintArray;

public class QuickSort {
	public static void main(String[] args) {
		
		int [] arr = {5, 2, 7, 6, 3, 8, 1};
		PrintArray.print(arr);
		quickSort(arr, 0, arr.length-1);
		PrintArray.print(arr);
	}
	

	private static void quickSort(int[] arr, int st, int end) {
        if (st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }
	

	private static int partition(int[] arr, int st, int end) {
		int pivot = arr[st];
		int count = 0;
		
		for (int i = st+1; i <= end; i++) {
			if(arr[i] <= pivot) {
				count++;
			}
		}
        
		int pivotIdx = st+count;
		swap(arr, st, pivotIdx);
		
		int i = st;
		int j = end;
		
		while (i<pivotIdx && j>pivotIdx) {
			if(arr[i] < arr[pivotIdx]) {
				i++;
			}
			else if (arr[j] > arr[pivotIdx]) {
				j--;
			}
			else {
				swap(arr, i, j);
				i++;
				j--; 
			}
		}
		
		return pivotIdx;
	}


	private static void swap(int[] arr, int st, int pivotIdx) {
		int temp = arr[st];
		arr[st] = arr[pivotIdx];
		arr[pivotIdx] = temp;
	}
	
	
	
}
