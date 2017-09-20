/* You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * 
 * Example 1:
 * coins = [1, 2, 5], amount = 11
 * return 3 (11 = 5 + 5 + 1)
 * 
 * Example 2:
 * coins = [2], amount = 3
 * return -1.
 * 
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 * 
 */
package lc.q0322.CoinChange;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        int[] m = new int[amount+1];
        for (int i = 0; i <=amount; i++)
        {
        	for (int j = 0; j < coins.length; j++)
        	{
                int idx = i+coins[j];
        		if (idx > amount || idx < 0)
        			continue;
        		if (i == 0)
        			m[idx] = 1;
        		else if (m[i] != 0)
        		{
        			if (m[idx]==0)
        				m[idx] = m[i]+1;
        			else
        				m[idx] = Math.min(m[idx], m[i]+1);
        		}
        	}
        }
        return m[amount]==0?-1:m[amount];
    }
}
