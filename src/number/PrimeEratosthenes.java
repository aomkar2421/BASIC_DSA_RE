package number;

import array.PrintArray;

public class PrimeEratosthenes {
	public static void main(String[] args) {
		
		int n = 37;
		function(n);
//		System.out.println(function(n));
		
	}

	private static void function(int n) {

		int [] arr = new int [n];

		for (int i = 2; i*i < n; i++) {
			
			for (int j = i*i; j < n; j+=i) {
				if(arr[j] == 0) {
					arr[j] = 1;
				}
			}
			
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
