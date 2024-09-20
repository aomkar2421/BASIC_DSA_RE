package gfg.array;

public class SubArrayMaximumKadane {
	public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	private static int maxSubArraySum(int[] arr) {
		
		int maxSum=Integer.MIN_VALUE;
		int sumHere=0;
		
		for (int i = 0; i < arr.length; i++) {
			sumHere += arr[i];
			maxSum = Math.max(maxSum, sumHere);
			sumHere = Math.max(sumHere, 0);
		}
		
		return maxSum;
	}
}
