/* Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.
 * You need to find the shortest such subarray and output its length.
 * 
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * Note:
 * Then length of the input array is in range [1, 10,000].
 * The input array may contain duplicates, so ascending order here means <=.
 * 
 */
package lc.q0581.ShortestUnsortedContinuousSubarray;

public class Solution {
	public int findUnsortedSubarray(int[] nums) {
	    int i = 0, j = -1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	    
	    for (int l = 0, r = nums.length - 1; r >= 0; l++, r--) {
	        max = Math.max(max, nums[l]);
	        if (nums[l] != max) j = l;
	        
	        min = Math.min(min, nums[r]);
	        if (nums[r] != min) i = r;
	    }
	    
	    return (j - i + 1);
	}
}
