/* Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * 
 * Note:
 * 
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * 
 */

package lc.q0189.RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
    	if (nums.length == 0)
    		return;
        flip(0, nums.length - 1, nums);
        k = k % nums.length;
        flip (0, k-1, nums);
        flip(k, nums.length-1, nums);
    }
    
    private void flip(int i, int j, int[] nums)
    {
        while (i < j)
        {
        	int tmp = nums[i]; 
        	nums[i] = nums[j];
        	nums[j] = tmp;
        	i++;
        	j--;
        }
    }
}
