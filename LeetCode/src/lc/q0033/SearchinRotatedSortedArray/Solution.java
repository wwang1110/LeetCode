/* Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 * 
 */
package lc.q0033.SearchinRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        
        while (l < r)
        {
        	int m = (l + r) / 2;
        	
      		if (nums[l] <= target && target <= nums[m])
      			r = m;
      		
      		else if (nums[l] <= nums[m] && (target < nums[l] || target > nums[m]))
      			l = m + 1;
      		
      		else if (nums[l] >= nums[m] && (target >= nums[l] || target <= nums[m]))
      			r = m;
      		
      		else
      			l = m + 1;
        }
        
        if (l < nums.length && nums[l] == target)
        	return l;
        
        return -1;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.search(new int[] {3, 1}, 1);
    }        
}
