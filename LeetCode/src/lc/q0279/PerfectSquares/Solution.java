/* 
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
*/

package lc.q0279.PerfectSquares;

public class Solution {
    public int numSquares(int n) {
        int[] tb = new int[n+1];
        for (int i = 1; i <= n; i++)
        {
        	int sq = i * i;
        	if (sq > 0 && sq <= n)
        		tb[sq] = 1;
        	if (tb[i] == 0)
        	{
        		tb[i] = Integer.MAX_VALUE;
        		for (int j=1; j*j <= i;j++)
        		{
        			tb[i] = Math.min(tb[i], 1 + tb[i-j*j]);
        		}
        	}
        }
        
        return tb[n];
    }
}
