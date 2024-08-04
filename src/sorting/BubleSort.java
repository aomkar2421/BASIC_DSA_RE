package sorting;

import array.PrintArray;

public class BubleSort {
	public static void main(String[] args) {
		int [] arr = {76,98,3,9,21,34,8,1,44};
		PrintArray.print(arr);
		sort(arr);
		PrintArray.print(arr);
	}

	private static void sort(int[] arr) {

		int temp;
		int n = arr.length;
		boolean flag;  
		/*it is used for best case. When array is already swapped then 2nd loop compares them 
		but as they are already sorted it dosent go inside if codition which resultes in flag 
		remains false indication elements onwards are are already swapped and 
		they dont need to be swapped. */

		for (int i = 0; i < n-1; i++) {
			flag = false;
			for (int j = 0; j < n-i-1; j++) {

				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
		}

	}
}
