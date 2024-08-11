package gfg.array;

import java.util.ArrayList;
import java.util.TreeSet;

public class Intersection {
	public static void main(String[] args) {

		int arr1[] = { 1, 2, 2, 2, 3 };
		int arr2[] = { 2, 3, 3, 4, 5, 5 };

		union(arr1, arr2);
		intersection(arr1, arr2);


	}

	private static void intersection(int[] arr1, int[] arr2) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int a : arr1) {
			ts.add(a);
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < arr2.length; i++) {
			if(ts.contains(arr2[i])) {
				al.add(arr2[i]);
			}
			ts.remove(arr2[i]);
		}
		System.out.println(al);
	}

	private static void union(int[] arr1, int[] arr2) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int a : arr1) {
			ts.add(a);
		}
		for (int a : arr2) {
			ts.add(a);
		}

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (Integer i : ts) {
			al.add(i);
		}
		System.out.println(al);
	}
}
