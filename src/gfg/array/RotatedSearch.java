package gfg.array;

public class RotatedSearch {
	
    // An iterative binary search function.
    public static int binarySearch(int[] arr, int low, int high, int x) {
        
    	
    	
        return -1;
    }

    
    // Function to get pivot. For array 3, 4, 5, 6, 1, 2
    // it returns 4 (index of 1)
    public static int findPivot(int[] arr, int low, int high) {
    	int ans = Integer.MAX_VALUE;
    	
    	while (low <= high) {
			
    		int mid = (low+high)/2;
    		
    		if (arr[low] <= arr[mid]) {
				ans = Math.min(ans, arr[low]);
				low = mid+1;
			}
    		else {
    			ans = Math.min(ans, arr[mid]);
				high = mid-1;
			}
    		
		}
    	
        return ans;
    }

    
    // Searches an element key in a pivoted
    // sorted array arr of size n
    public static int pivotedBinarySearch(int[] arr, int n, int key) {

    	int minIdx = findPivot(arr, 0, arr.length-1);
    	
    	return minIdx;
    }

    // Driver program to check above functions
    public static void main(String[] args) {
        // Let us search 3 in below array
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 3;
        System.out.println(pivotedBinarySearch(arr, arr.length, key));
    }
}
