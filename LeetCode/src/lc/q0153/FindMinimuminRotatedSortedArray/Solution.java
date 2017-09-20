/* Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * You may assume no duplicate exists in the array. 
 * 
 */

package lc.q0153.FindMinimuminRotatedSortedArray;

public class Solution {
    public int findMin(int[] nums) {
    	
    	if (nums.length == 0)
    		return -1;
    
    	int i = 0;
    	int j = nums.length-1;
    	
    	while(i < j)
    	{
    		int m = (i+j)/2;
    		
    		if (nums[i]<=nums[m]&&nums[m]<=nums[j])
    			return nums[i];
    		else if (nums[i] <= nums[m])
    			i = m+1;
    		else
    			j = m;
    	}
    	return nums[i];
    }
}
