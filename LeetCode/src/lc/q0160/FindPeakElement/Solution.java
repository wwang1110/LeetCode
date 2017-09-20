/* A peak element is an element that is greater than its neighbors.
 * 
 * Given an input array where num[i] != num[i+1], find a peak element and return its index.
 * 
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * 
 * You may imagine that num[-1] = num[n] = MIN_VALUE.
 * 
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 * 
 * click to show spoilers.
 * 
 */

package lc.q0160.FindPeakElement;

public class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        while (i < nums.length)
        {
        	boolean left = false;
        	if (i == 0 || i > 0 && nums[i] > nums[i-1])
        		left = true;
        	boolean right = false;
        	if (i == nums.length-1 || i < nums.length-1 && nums[i] > nums[i+1])
        		right = true;
        	
        	if(left && right)
        		return i;
        	i++;
        }
        
        return -1;
    }
}
