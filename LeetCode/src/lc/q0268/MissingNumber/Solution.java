/* Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * 
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * 
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * 
 */
package lc.q0268.MissingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
    	if (nums.length == 0)
    		return -1;

    	long sum = 0;
    	for (int i = 0; i < nums.length; i++)
    		sum += nums[i];
    	
    	long msum = (nums.length + 1) * nums.length / 2;
    	
    	return (int)(msum - sum);
    }
}
