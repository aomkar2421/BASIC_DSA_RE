package daily;

import array.PrintArray;

public class KadaneMaxSubArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        PrintArray.print(arr);
        solution(arr);
    }

    private static void solution(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
