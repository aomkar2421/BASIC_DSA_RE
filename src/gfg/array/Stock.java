package gfg.array;

public class Stock {
	
	public static void main(String[] args) {
		
		int arr [] = {7, 1, 5, 3, 6, 4};
		PrintArray.print(arr);
		function(arr);
		PrintArray.print(arr);

	}
	
	static void function(int [] arr) {
		
		int min = arr[0];
		int maxProfit = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
			int profit = arr[i] - min;
			
			if (profit > maxProfit) {
				maxProfit = profit;
			}
		}
		System.out.println(maxProfit);
	}
	
}
