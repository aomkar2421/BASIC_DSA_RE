package sorting;

import array.PrintArray;

public class MergeSort {
	public static void main(String[] args) {

		int [] arr = {5, 2, 7, 6, 8, 1};
		PrintArray.print(arr);
		sort(arr, 0, arr.length-1);
		PrintArray.print(arr);

	}

	

	private static void sort(int[] arr, int l, int r) {
		
		if(l >= r) {
			return;
		}
		
		int m = l + (r-l)/2;
		
		sort(arr, l, m);
		sort(arr, m+1, r);
		
		merge(arr, l, m, r);
	}



	private static void merge(int[] arr, int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2 = r - m;

		int [] left = new int [n1];
		int [] right = new int [n2];
		
		for (int i = 0; i < n1; i++) {
			left[i] = arr[l+i];
		}
		
		for (int j = 0; j < n2; j++) {
			right[j] = arr[m+1+j];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
		
	}

}
