/* Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * For example:

 * A = [2,3,1,1,4], return true.
 * 
 * A = [3,2,1,0,4], return false.
 */

package lc.q0055.JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
    	int maxsteps = 0;
    	for (int i = 0; i < nums.length; i++)
    	{
            if (i > maxsteps)
                return false;
    		if (i + nums[i] >= nums.length - 1)
    			return true;
    		maxsteps = Math.max(maxsteps, i + nums[i]);
    	}
    	return false;
    }
    
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.canJump(new int [] {3, 2, 1, 0, 4});
    }      
}
