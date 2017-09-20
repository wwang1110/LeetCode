/* Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * 
 * Note:
 * 
 * You are not suppose to use the library's sort function for this problem.
 * 
 * click to show follow up.
 * 
 */

package lc.q0075.SortColors;

public class Solution {
    public void sortColors(int[] nums) {
    	int zeros = 0;
        int ones = 0;
        int twos = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
        	if (nums[i] == 0)
        		zeros++;
        	else if (nums[i] == 1)
        		ones++;
        	else if (nums[i] == 2)
        		twos++;
        }
        
        int i = 0;
        while (zeros-- > 0) nums[i++] = 0;
        while (ones-- > 0) nums[i++] = 1;
        while (twos-- > 0) nums[i++] = 2;
    }
}
