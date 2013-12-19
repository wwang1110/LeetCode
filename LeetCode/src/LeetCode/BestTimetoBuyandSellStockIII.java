package LeetCode;

public class BestTimetoBuyandSellStockIII {
	//Say you have an array for which the ith element is the price of a given stock on day i.

	//Design an algorithm to find the maximum profit. You may complete at most two transactions.

	//Note:
	//You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        
        int nums[] = new int[prices.length]; 
        for (int i = prices.length - 1; i > 0; i--)
        	nums[i] = prices[i] - prices[i-1];
        
    	int left[] = new int[prices.length];
    	int right[] = new int[prices.length];
    	
        int maxsum = 0;
        int sum = 0;
        for (int i = 0; i < prices.length; i++)
        {
        	sum += nums[i];
        	if (sum < 0)
        		sum = 0;
        	else
        		maxsum = Math.max(sum,  maxsum);
        	left[i] = maxsum;
        }
        
        maxsum = 0;
        sum = 0;
        for (int i = prices.length - 1; i > 0; i--)
        {
        	sum += nums[i];
        	if (sum < 0)
        		sum = 0;
        	else
        		maxsum = Math.max(sum,  maxsum);
        	right[i] = maxsum;
        }
        
        maxsum = 0;
        for (int i = 0; i < prices.length - 1; i++)
        {
        	maxsum = Math.max(maxsum, left[i] + right[i + 1]);
        }
        
        return maxsum;
    }	
}
