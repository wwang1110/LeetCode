/* Follow up for "Search in Rotated Sorted Array":
 * 
 * What if duplicates are allowed?
 * 
 * Would this affect the run-time complexity? How and why?
 * 
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Write a function to determine if a given target is in the array.
 * 
 * The array may contain duplicates.
 */


package lc.q0081.SearchinRotatedSortedArrayII;

public class Solution {
    public boolean search(int[] nums, int target) {
    	
    	if(nums.length == 0)
    		return false;
    	
    	int l = 0;
    	int r = nums.length-1;
    	
    	while (l < r)
    	{
    		int m = (l + r) / 2;
    		if (nums[m] == target)
    			return true;
    		
    		if (nums[l] < nums[m] || nums[m] > nums[r])
    		{
    			if (nums[l] <= target && target < nums[m])
    				r = m;
    			else
    				l = m + 1;
    		}
    		else if (nums[m] < nums[r] || nums[l] > nums[m])
    		{
    			if (nums[m] < target && target <= nums[r])
    				l = m + 1;
    			else
    				r = m;
    		}
    		else
    			r--;
    	}
    	
    	return nums[l] == target;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	int[] nums = new int[] {1,2,1};
    	s.search(nums, 2);
    }
}
