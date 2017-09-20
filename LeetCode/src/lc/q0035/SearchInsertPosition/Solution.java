/* Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * 
 * [1,3,5,6], 5 -> 2
 * [1,3,5,6], 2 -> 1
 * [1,3,5,6], 7 -> 4
 * [1,3,5,6], 0 -> 0
 */

package lc.q0035.SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
    	
    	if (nums.length == 0 || nums[0] > target)
    		return 0;
    	
    	int l = 0;
    	int r = nums.length - 1;
    	
    	if (nums[r] < target)
    		return r + 1;
    	
    	while (l < r)
    	{
    		int m = (l + r) / 2;
    		
    		if (nums[m] == target)
    			return m;
    		
    		if (nums[m] > target)
    			r = m;
    		else
    			l = m + 1;
    	}
    	
    	return l;
    }
}
