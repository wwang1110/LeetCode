/* Given a non-negative integer n, count all numbers with unique digits, x, where 0 <= x < 10n.
 * 
 * Example:
 * Given n = 2, return 91. (The answer should be the total numbers in the range of 0 <= x < 100, excluding [11,22,33,44,55,66,77,88,99])
 * 
 */

package lc.q0357.CountNumberswithUniqueDigits;

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        int[] dp = new int[n+1];
        dp[1] = 10;
        int product = 9;
        for (int i = 2, f = 9; i <=n&&f>=0; i++,f--)
        {
        	product *= f;
        	dp[i] = dp[i-1] + product;
        }
        return dp[n];
    }
}
