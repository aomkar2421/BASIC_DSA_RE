package gfg.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import array.PrintArray;

public class Duplicates {
	
	public static void main(String[] args) {
		
		int arr [] = {1, 2, 3, 6, 3, 6, 1};
		PrintArray.print(arr);
		function(arr);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i : arr) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		
		for ( Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				result.add(entry.getKey());
			}
		}
		
		System.out.println(result);
		if (result.isEmpty()) {
			System.out.println(-1);
		}
	}
	
}
