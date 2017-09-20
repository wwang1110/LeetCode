/* Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum >= s. If there isn't one, return 0 instead.
 * 
 * For example, given the array [2,3,1,2,4,3] and s = 7,
 * 
 * the subarray [4,3] has the minimal length under the problem constraint.
 * 
 */

package lc.q0209.MinimumSizeSubarraySum;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int mindis = Integer.MAX_VALUE;
        while (j < nums.length || sum >= s)
        {
        	if (sum < s)
        	{
        		sum += nums[j];
        		j++;
        	}
        	else
        	{
        		mindis = Math.min(mindis, j-i);
        		if (mindis == 1)
        			return mindis;
        		sum -= nums[i];
        		i++;
        	}
        }
        
        return mindis == Integer.MAX_VALUE ? 0 : mindis;
    }
}
