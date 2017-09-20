/*	Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 	Note: The solution set must not contain duplicate triplets.
 * 	For example, given array S = [-1, 0, 1, 2, -1, -4],
 * 	A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */

package lc.q0015.ThreeSum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	Arrays.sort(nums);
    	
    	for(int i = 0; i < nums.length - 2; i ++)
    	{
    		if (i == 0 || i > 0 && nums[i] != nums[i-1])
    		{
    			int lo = i + 1;
    			int hi = nums.length - 1;

    			while (lo < hi)
    			{
        			if (nums[i] + nums[lo] + nums[hi] == 0)
        			{
        				res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
        				while (lo < hi && nums[lo] == nums[lo + 1]) lo ++;
        				while (lo < hi && nums[hi] == nums[hi - 1]) hi --;
        				lo ++;
        				hi --;
        			}
        			else if (nums[i] + nums[lo] + nums[hi] < 0)
        				lo ++;
        			else
        				hi --;
    			}
    		}
    	}
    	
    	return res;
    }
}
