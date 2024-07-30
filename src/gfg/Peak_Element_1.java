package gfg;

import java.util.ArrayList;

public class Peak_Element_1 {
	
	public static void main(String[] args) {
		
		int arr [] = {5,4,5,6,7,8,3,2,2};
		findPeakElements(arr);
		
	}
	
	public static ArrayList<Integer> findPeakElements(int[] arr) {
        ArrayList<Integer> peaks = new ArrayList<>();

        if (arr == null || arr.length == 0) {
            return peaks; 
        }
        int n = arr.length;
        
        if(arr[0] >= arr[1]) {
        	peaks.add(arr[0]);
        }
        
        if(arr[n-1] >= arr[n-2]) {
        	peaks.add(arr[n-1]);
        }
        if(arr.length==1) {
        	peaks.add(arr[0]);
        }

        for (int i = 1; i < n-2; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                peaks.add(arr[i]);
            }
        }
        System.out.println(peaks);
        return peaks;
    }
	
}
