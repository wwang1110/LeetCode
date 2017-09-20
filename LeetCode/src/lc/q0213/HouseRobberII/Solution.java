/* Note: This is an extension of House Robber.
 * 
 * After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.
 * 
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * 
 */

package lc.q0213.HouseRobberII;

public class Solution {
    public int rob(int[] nums) {
    	if (nums.length == 0)
    		return 0;
        if (nums.length == 1)
        	return nums[0];
        
        return Math.max(rob(nums, 0, nums.length-2), rob(nums, 1, nums.length-1));
    }
    
    private int rob(int[] nums, int i, int j)
    {
    	int a = 0;
    	int b = 0;
    	
    	for (int k = i; k <= j; k++)
    		if (k % 2 == 0)
    			a = Math.max(b, a + nums[k]);
    		else
    			b = Math.max(a, b + nums[k]);
    	return Math.max(a, b);
    }
}
