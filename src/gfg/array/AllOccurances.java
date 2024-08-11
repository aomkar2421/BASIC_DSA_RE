package gfg.array;

import java.util.HashMap;

import array.PrintArray;

public class AllOccurances {
	
	public static void main(String[] args) {
		
		int arr [] = {4,2,6,2,1,4,2};
		PrintArray.print(arr);
		function(arr);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr) {
		
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			hMap.put(arr[i], hMap.getOrDefault(arr[i], 0)+1 );
		}
		System.out.println(hMap);
	}
	
}
