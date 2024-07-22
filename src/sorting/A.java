package sorting;

import array.PrintArray;

public class A {
	public static void main(String[] args) {
		System.out.println("A");
		int [] arr = {76,98,3,9,21,34,8,1,44};
		PrintArray.print(arr);
		sort(arr);
		PrintArray.print(arr);
	}

	private static void sort(int[] arr) {
		int count = 0;
		int temp;
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				
				count++;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		System.out.println(count);
		
	}
}
