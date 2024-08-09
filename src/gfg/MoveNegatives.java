package gfg;

import java.util.ArrayList;

import array.PrintArray;

public class MoveNegatives {

	public static void main(String[] args) {

		int[] arr = { -5, 7, -3, -4, 9, 10, -1, 11 };
		PrintArray.print(arr);
		function(arr);
		PrintArray.print(arr);

	}

	static void function(int [] arr) {

		ArrayList<Integer> negatives = new ArrayList<Integer>();

		int currentIndex = 0;

		for(int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				arr[currentIndex++] = arr[i];
			}
			else {
				negatives.add(arr[i]);
			}
		}

		int negativeCurrentIndex = 0;
		for(int i = currentIndex; i < arr.length; i++) {
			arr[i] = negatives.get(negativeCurrentIndex++);
		}

	}

}
