/* Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */

package lc.q0026.RemoveDuplicatesfromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
    	int i = 0;
    	int j = 1;
    	
    	while (j < nums.length)
    	{
    		if (nums[i] != nums[j])
    		{
    			if (i + 1 != j)
    				nums[i + 1] = nums[j];
    			i ++;
    		}
    		j++;
    	}
    	
    	return i + 1;
    }
}
