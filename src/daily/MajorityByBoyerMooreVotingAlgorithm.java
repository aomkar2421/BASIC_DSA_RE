package daily;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import array.PrintArray;

public class MajorityByBoyerMooreVotingAlgorithm {
	public static void main(String[] args) {
		int [] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
		PrintArray.print(arr);
		System.out.println(findMajority(arr));
	}
	
    public static List<Integer> findMajority(int [] nums) {
    	
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	int n = nums.length;
    			
    	int candidate1=0, candidate2=0, count1=0, count2=0;
    	
    	for (int num : nums) {
			if (num == candidate1) {
				count1++;
			}else if (num == candidate2) {
				count2++;
			}else if (count1==0) {
				candidate1 = num;
				count1++;
			}else if (count2==0) {
				candidate2 = num;
				count2++;
			}else {
				count1--;
				count2--;
			}
		}
    	
    	
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
    	
        
    	if (count1>n/3) {
			al.add(candidate1);
		}
    	if (count2>n/3) {
			al.add(candidate2);
		}
    	
        return al.isEmpty() ? Collections.singletonList(-1) : al ;
        
    }
    
}
