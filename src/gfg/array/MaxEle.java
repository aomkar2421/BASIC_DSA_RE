package gfg.array;

public class MaxEle {
	
	public static void main(String[] args) {
		
		int arr [] = {4,92,10,1,20,7,8};
		function(arr);
		
	}
	
	static void function(int [] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
}
