package gfg;

import java.util.Arrays;
import java.util.HashMap;

import array.PrintArray;

public class PairSum2 {
	
	public static void main(String[] args) {
		
		int arr [] = {1,5,7,-1,4,2};
		PrintArray.print(arr);
		int sum = 6;
		function(arr,sum);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr, int sum) {
		int n = arr.length;
		int count = 0;
		Arrays.sort(arr);

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<n-1;i++) {
			
			if(hm.containsKey(sum - arr[i])) {
				count += hm.get(sum - arr[i]);
			}
			
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			
		}
		System.out.println(count);
	}
	
}
