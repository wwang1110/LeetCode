/* Given an unsorted array of integers, find the length of longest increasing subsequence.
 * 
 * For example,
 * Given [10, 9, 2, 5, 3, 7, 101, 18],
 * The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.
 * 
 * Your algorithm should run in O(n2) complexity.
 * Follow up: Could you improve it to O(n log n) time complexity?
 * 
 */

package lc.q0300.LongestIncreasingSubsequence;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;
    	int[] lsq = new int[nums.length];
    	
    	for (int i = 0; i < nums.length; i++)
    	{
    		int maxs = 1;
    		for (int j = 0; j < i; j++)
    			if (nums[j] < nums[i])
    				maxs = Math.max(lsq[j]+1, maxs);
    		lsq[i] = maxs;
    	}
    	
        int res = 0;
        for (int i = 0; i < lsq.length; i++)
            res = Math.max(res, lsq[i]);
        return res;
    }
}
