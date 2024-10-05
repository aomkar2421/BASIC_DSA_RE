package daily;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import array.PrintArray;

public class MajorityVote {
	public static void main(String[] args) {
		int [] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
		PrintArray.print(arr);
		System.out.println(findMajority(arr));
	}
	
    public static List<Integer> findMajority(int [] nums) {
    	
    	HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	int n = nums.length;
    			
    	for (int i = 0; i < nums.length; i++) {
			hMap.put(nums[i], hMap.getOrDefault(nums[i], 0)+1);
		}
    	
    	for (Entry<Integer, Integer> entry : hMap.entrySet()) {
			if (entry.getValue()>n/3) {
				al.add(entry.getKey());
			}
		}
    	
        return al.isEmpty() ? Collections.singletonList(-1) : al ;
        
    }
    
}
