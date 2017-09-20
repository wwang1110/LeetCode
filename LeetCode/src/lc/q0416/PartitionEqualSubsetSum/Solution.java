/* Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
 * 
 * Note:
 * Each of the array element will not exceed 100.
 * The array size will not exceed 200.
 * Example 1:
 * Input: [1, 5, 11, 5]
 * Output: true
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 * 
 * Example 2:
 * Input: [1, 2, 3, 5]
 * Output: false
 * Explanation: The array cannot be partitioned into equal sum subsets.
 * 
 */
package lc.q0416.PartitionEqualSubsetSum;

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n: nums)
        	sum+=n;
        if((sum&1)==1)
        	return false;
        sum/=2;
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        dp[0][0]=true;
        for(int i=0;i<nums.length;i++)
        	for(int j=0;j<=sum;j++)
        	{
        		dp[i+1][j]=dp[i][j];
        		if(j>=nums[i])
        			dp[i+1][j]=dp[i+1][j]||dp[i][j-nums[i]];
        	}
        return dp[nums.length][sum];
    }
}
