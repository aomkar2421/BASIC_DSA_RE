package sorting;

import array.PrintArray;

public class Move_0_End {
	public static void main(String[] args) {
		
		int [] arr = {0, 5, 0, 2, 3, 0, 7};
		PrintArray.print(arr);
		sort(arr);
		PrintArray.print(arr);

	}

	private static void sort(int[] arr) {

		int n = arr.length;
		int temp;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				
				if(arr[j] == 0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
	}
}
