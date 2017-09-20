/*	Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * 	Note: The solution set must not contain duplicate quadruplets.
 * 	For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 * 	A solution set is:
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 */
package lc.q0018.FourSum;
import java.util.*;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	Arrays.sort(nums);
    	
    	for (int i = 0; i < nums.length - 3; i ++)
    	{
    		if (i != 0 && nums[i] == nums[i-1])
    			continue;
    		for (int j = i + 1; j < nums.length - 2; j++)
    		{
    			if (j != i + 1 && nums[j] == nums[j-1])
    				continue;
    			int lo = j + 1;
    			int hi = nums.length - 1;
    			while (lo < hi)
    			{
    				if (nums[i] + nums[j] + nums[lo] + nums[hi] == target)
    				{
    					res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
    					while (lo < hi && nums[lo] == nums[lo + 1]) lo ++;
    					while (lo < hi && nums[hi] == nums[hi - 1]) hi --;
    					lo ++;
    					hi --;
    				}
    				else if (nums[i] + nums[j] + nums[lo] + nums[hi] < target)
    					lo ++;
    				else
    					hi --;	
    			}
    		}
    	}
    	
    	return res;
    }
}
