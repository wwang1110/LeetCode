package LeetCode;

public class BestTimetoBuyandSellStockII {
	//Say you have an array for which the ith element is the price of a given stock on day i.

	//Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
	//(ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple 
	//transactions at the same time (ie, you must sell the stock before you buy again).
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        
        int nums[] = new int[prices.length]; 
        for (int i = prices.length - 1; i > 0; i--)
        	nums[i] = prices[i] - prices[i-1];
        
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        	if (nums[i] > 0)
        		sum += nums[i];
        
        return sum;
    }	
}
