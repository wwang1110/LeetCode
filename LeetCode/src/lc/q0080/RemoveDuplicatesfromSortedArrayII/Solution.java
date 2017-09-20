/* 
 * Follow up for "Remove Duplicates":
 * 
 * What if duplicates are allowed at most twice?
 * 
 * For example,
 * 
 * Given sorted array nums = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 */

package lc.q0080.RemoveDuplicatesfromSortedArrayII;

public class Solution {
    public int removeDuplicates(int[] nums) {
    	
    	if (nums.length <= 2)
    		return nums.length;
    	
        int i = 1;
        int j = 1;
        int count = 1;
        while (j < nums.length)
        {
        	if (nums[j-1] != nums[j])
        		count = 1;
        	else
        		count ++;
        	
        	if (count <= 2)
        	{
        		nums[i] = nums[j];
        		i++;
        	}
        	j++;
        }
        return i;
    }
}
