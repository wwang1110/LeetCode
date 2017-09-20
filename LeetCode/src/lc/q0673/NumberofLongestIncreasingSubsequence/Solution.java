/*
Given an unsorted array of integers, find the number of longest increasing subsequence.

Example 1:
Input: [1,3,5,4,7]
Output: 2
Explanation: The two longest increasing subsequence are [1, 3, 4, 7] and [1, 3, 5, 7].
Example 2:
Input: [2,2,2,2,2]
Output: 5
Explanation: The length of longest continuous increasing subsequence is 1, and there are 5 subsequences' length is 1, so output 5.
Note: Length of the given array will be not exceed 2000 and the answer is guaranteed to be fit in 32-bit signed int.
 */
package lc.q0673.NumberofLongestIncreasingSubsequence;

import java.util.*;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
    	int[] dp=new int[nums.length];
    	int[] count=new int[nums.length];
    	Arrays.fill(dp, 1);
    	int maxlen=0;
    	for(int i=0;i<nums.length;i++)
    	{
    		for(int j=i-1;j>=0;j--)
    			if(nums[i]>nums[j])
    			{
    				dp[i]=Math.max(dp[i], dp[j]+1);
    				maxlen=Math.max(dp[i], maxlen);
    			}
    		if(dp[i]==1)
    			count[i]=1;
    		for(int j=i-1;j>=0;j--)
    			if(nums[i]>nums[j]&&dp[i]==dp[j]+1)
    				count[i]+=count[j];
    	}
    	
    	int sum=0;
    	for(int i=0;i<nums.length;i++)
    		if(dp[i]==maxlen)
    			sum+=count[i];
    	return sum;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.findNumberOfLIS(new int[] {1,2,4,3,5,4,7,2});
    }    
}
