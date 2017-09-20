/* Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.
 * 
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 * 
 * Note: You may assume that n is not less than 2 and not larger than 58.
 * 
 */

package lc.q0343.IntegerBreak;

public class Solution {
    public int integerBreak(int n) {
    	if (n <= 3)
    		return n-1;
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++ )
        {
        	dp[i] = i;
        	for (int j = 1; j < i; j++)
        	{
        		int num = i-j;
        		dp[i] = Math.max(dp[j]*num, dp[i]);
        	}
        }
        return dp[n];
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.integerBreak(4);
    }    
}
