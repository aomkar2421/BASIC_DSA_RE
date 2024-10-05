package daily;

import array.PrintArray;

public class SumDivisibleByK {
	public static void main(String[] args) {
		int [] arr = {4,2,1,5,6,8,9};
		int p = 9;
		PrintArray.print(arr);
		solution(arr,p);
	}

	private static void solution(int[] arr, int p) {
		int totalSum=0;
		for (int i : arr) {
			totalSum+=i;
		}
		
		int rem = (int) (totalSum%p);
		
		int sum = 0;
		int j=0;
		int length;
		int minLength = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if (sum > rem) {
				sum = 0;
				j = i+1;
			}
			else if (sum == rem) {
				length = i-j;
				if (minLength>length) {
					minLength=length;
				}
			}
		}
		System.out.println(minLength);
	}
}
