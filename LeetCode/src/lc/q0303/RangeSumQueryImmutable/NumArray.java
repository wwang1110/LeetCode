/* Given an integer array nums, find the sum of the elements between indices i and j (i <= j), inclusive.
 * 
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * 
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * 
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 * 
 */
package lc.q0303.RangeSumQueryImmutable;

import java.util.*;

public class NumArray {
	List<Integer> sums = new ArrayList<Integer>();
    public NumArray(int[] nums) {
    	int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
        	sum += nums[i];
        	sums.add(sum);
        }
    }
    
    public int sumRange(int i, int j) {
        if (i == 0)
        	return sums.get(j);
        return sums.get(j) - sums.get(i-1);
    }
}
