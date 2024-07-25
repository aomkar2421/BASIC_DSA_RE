package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	public static void main(String[] args) {

		float [] arr = {0.5f, 0.2f, 0.7f, 0.36f, 0.33f, 0.28f, 0.1f};
		print(arr);
		sort(arr);
		print(arr);

	}


	private static void sort(float[] arr) {

		int n = arr.length;
		ArrayList<Float> [] buckets = new ArrayList[n];
		
		for (int i = 0; i < n; i++) {
			buckets[i] = new ArrayList<Float>();
		}
		
		for (int i = 0; i < n; i++) {
			int bucketIdx = (int) arr[i]*n;
			buckets[bucketIdx].add(arr[i]);
		}
		
		for (int i = 0; i < buckets.length; i++) {
			Collections.sort(buckets[i]);
		}
		
		int idx=0;
		for (int i = 0; i < buckets.length; i++) {
			ArrayList<Float> currentBucket = buckets[i];
			for (int j = 0; j < buckets[i].size(); j++) {
				arr[idx] = currentBucket.get(j);
				idx++;
			}
		}
		
	}


	public static void print(float [] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
