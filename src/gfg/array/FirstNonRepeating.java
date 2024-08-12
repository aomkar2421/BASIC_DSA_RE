package gfg.array;

import java.util.HashMap;
import java.util.Map;

import gfg.array.PrintArray;

public class FirstNonRepeating {
	
	public static void main(String[] args) {
		
		int arr [] = { 9, 4, 9, 6, 7, 4 };
		PrintArray.print(arr);
		function(arr);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i : arr) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}

	}
	
}
