package gfg;

public class MinEle {
	
	public static void main(String[] args) {
		
		int arr [] = {4,9,10,1,20,7,8};
		function(arr);
		
	}
	
	static void function(int [] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
}
