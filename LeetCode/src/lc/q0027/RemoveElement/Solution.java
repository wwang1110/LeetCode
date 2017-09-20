/* Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 */

package lc.q0027.RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
    
    	int i = 0;
    	int j = nums.length - 1;
    	
    	while (i <= j)
    	{
    		while(i <= j && nums[j] == val)
    			j--;
    		
    		if (i <= j && nums[i] == val)
    		{
    			nums[i] = nums[j];
    			j--; 
    		}
    		i++;
    	}
    	return j + 1;
    }
}
