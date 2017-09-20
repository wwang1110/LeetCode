/*
Given an unsorted array of integers, find the length of longest continuous increasing subsequence.

Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
Example 2:
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
Note: Length of the array will not exceed 10,000.
 */
package lc.q0674.LongestContinuousIncreasingSubsequence;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
    	if(nums.length==0)
            return 0;
    	int i=0;
    	int j=1;
    	int maxlen=1;
    	while(j<nums.length)
    	{
    		if(nums[j]>nums[j-1])
    			maxlen=Math.max(j-i+1, maxlen);
    		else
    			i=j;
    		j++;
    	}
    	return maxlen;
    }
}
