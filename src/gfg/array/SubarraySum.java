package gfg.array;

import java.util.ArrayList;

public class SubarraySum {

    public static ArrayList<Integer> subarraySum(int[] arr, int n, long sum) {
    	
        int i = 0;
        long currsum = 0;
        ArrayList<Integer> res = new ArrayList<>();

        for ( int j = 0; j < n; j++) {

            currsum = currsum + arr[j];
            while (currsum > sum) {
                currsum = currsum - arr[i];
                i++;
            }
            
            if(currsum == sum && i<=j) {
            	res.add(i);
            	res.add(j);
            	return res;
            }
            
        }

            res.add(-1);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {13, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 0;
        ArrayList<Integer> res = subarraySum(arr, n, sum);
        for (int i : res)
            System.out.print(i + " ");
    }
}
