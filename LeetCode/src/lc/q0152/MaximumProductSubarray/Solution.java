/* Find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * 
 * For example, given the array [2,3,-2,4],
 * 
 * the contiguous subarray [2,3] has the largest product = 6.
 * 
 */

package lc.q0152.MaximumProductSubarray;

public class Solution {
    public int maxProduct(int[] nums) {
    	if (nums.length == 0)
    		return 0;
    	
    	int max = nums[0];
    	int min = nums[0];
    	int res = nums[0];
    	for (int i = 1; i < nums.length; i++)
    	{
    		if (nums[i] < 0)
    		{
    			int tmp = max;
    			max = min;
    			min = tmp;
    		}
    		
    		max = Math.max(max * nums[i], nums[i]);
    		min = Math.min(min * nums[i], nums[i]);
            
            res = Math.max(res, max);
    	}
    	
    	return res;
    }
}