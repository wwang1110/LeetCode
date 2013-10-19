package LeetCode;

public class BestTimetoBuyandSellStock {
	//Say you have an array for which the ith element is the price of a given stock on day i.

	//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        
        int nums[] = new int[prices.length]; 
        for (int i = prices.length - 1; i > 0; i--)
        	nums[i] = prices[i] - prices[i-1];

        int maxsum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
        	sum += nums[i];
        	if (sum < 0)
        		sum = 0;
        	else
        		maxsum = Math.max(sum,  maxsum);
        }
        return maxsum;
    }
}
