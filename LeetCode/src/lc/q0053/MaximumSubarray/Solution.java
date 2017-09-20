/* Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * 
 */

package lc.q0053.MaximumSubarray;

public class Solution {

	public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        int i = 0;
        
        for (int j = 0; j < nums.length; j++ )
        	maxsum = Math.max(maxsum, nums[j]);
        if (maxsum <= 0)
        	return maxsum;
        
        while (i < nums.length)
        {
        	cursum += nums[i];
        	if (cursum > 0)
        		maxsum = Math.max(cursum, maxsum);
        	else
        		cursum = 0;
        	i ++;
        }
        return maxsum;
    }
}
