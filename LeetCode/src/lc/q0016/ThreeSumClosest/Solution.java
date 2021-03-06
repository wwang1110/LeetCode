/* Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

package lc.q0016.ThreeSumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	
    	if (nums.length < 3)
    		return 0;
    	
        Arrays.sort(nums);
        
        int closestnum = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < nums.length - 2; i++)
        {
        	int lo = i + 1;
        	int hi = nums.length - 1;
        	
        	while (lo < hi)
        	{
        		int v = nums[i] + nums[lo] + nums[hi];
        		
        		if (Math.abs(target - closestnum) > Math.abs(target - v))
        		{
        			closestnum = v;
        		}
        		
        		if (v < target)
        			lo ++;
        		else 
        			hi --;
        	}
        }
        
        return closestnum;
    }
}
