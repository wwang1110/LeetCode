/* Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */

package lc.q0034.SearchforRange;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
    	
    	int lb = -1;
    	int l = 0;
    	int r = nums.length - 1;
    	
    	while (l < r)
    	{
    		if (nums[l] == target)
    			break;
    		int m = (l + r) / 2;
    		
    		if (nums[m] >= target)
    			r = m;
    		else
    			l = m + 1;
    	}
    	
    	if (nums.length > l && nums[l] == target)
    		lb = l;

    	int ub = -1;
    	l = 0;
    	r = nums.length - 1;
    	
    	while (l < r)
    	{
    		if (nums[r] == target)
    			break;
    		
    		int m = (l + r + 1) / 2;
    		
    		if (nums[m] <= target)
    			l = m;
    		else
    			r = m - 1;
    	}
    	
    	if (nums.length > r && nums[r] == target)
    		ub = r;
    	
    	return new int[] {lb, ub};
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.searchRange(new int[] {}, 8);
    }     
}
