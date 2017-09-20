/* Say you have an array for which the ith element is the price of a given stock on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
 * 
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 * After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
 * Example:
 * 
 * prices = [1, 2, 3, 0, 2]
 * maxProfit = 3
 * transactions = [buy, sell, cooldown, buy, sell]
 * 
 */

package lc.q0309.BestTimetoBuyandSellStockwithCooldown;

public class Solution {
    public int maxProfit(int[] prices) {
    	if (prices.length==0)
    		return 0;
    	int[] b = new int[prices.length];
    	int[] s = new int[prices.length];
    	
    	b[0] = -prices[0];
    	
    	s[0] = 0;
    	
    	for (int i = 1; i < prices.length; i++)
    	{
    		if (i>=2)
    			b[i] = Math.max(b[i-1], s[i-2]-prices[i]);
    		else
    			b[i] = Math.max(b[i-1], -prices[i]);
    		s[i] = Math.max(s[i-1], b[i-1]+prices[i]);
    	}
    	
    	return s[prices.length-1];
    }
}
