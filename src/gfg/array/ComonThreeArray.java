package gfg.array;

import java.util.ArrayList;

import gfg.array.PrintArray;

public class ComonThreeArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 10, 20, 30 };
		int[] arr2 = { 5, 13, 15, 20 };
		int[] arr3 = { 5, 20 };

		function(arr1, arr2, arr3);

	}

	static void function(int [] arr1, int[] arr2, int[] arr3) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		int i=0, j=0, k=0;
		int n1=arr1.length, n2=arr2.length, n3=arr3.length;

		while (i<n1 && j<n2 && k<n3) {
			
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				al.add(arr1[i]);
				
				i++;
				j++;
				k++;
				
				while (i < arr1.length && arr1[i] == arr1[i - 1])
                    i++;

                while (j < arr2.length && arr2[j] == arr2[j - 1])
                    j++;

                while (k < arr3.length && arr3[k] == arr3[k - 1])
                    k++;
				
			}
			
			else if (arr1[i] < arr2[j]) {
				i++;
			}
			else if (arr2[j] < arr3[k]) {
				j++;
			}
			else{
				k++;
			}

		}
		System.out.println(al);
	}

}
