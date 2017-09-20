/* Given an integer array nums, find the sum of the elements between indices i and j (i <= j), inclusive.
 * 
 * The update(i, val) function modifies nums by updating the element at index i to val.
 * Example:
 * Given nums = [1, 3, 5]
 * 
 * sumRange(0, 2) -> 9
 * update(1, 2)
 * sumRange(0, 2) -> 8
 * 
 * Note:
 * The array is only modifiable by the update function.
 * You may assume the number of calls to update and sumRange function is distributed evenly.
 * 
 */

package lc.skipped.q0307.RangeSumQueryMutable;

public class NumArray {
	int[] numbers;
	int[] sums;
    public NumArray(int[] nums) {
        numbers = nums;
        sums = new int[nums.length];
        int s = 0;
        for (int i = 0;i < nums.length;i++)
        {
        	s+=nums[i];
        	sums[i] = s;
        }
    }
    
    public void update(int i, int val) {
        int diff = val - numbers[i];
        numbers[i] = val;
        for (int j = 0; j <= i; j++)
        	sums[j] += diff;
        	
    }
    
    public int sumRange(int i, int j) {
        int low = 0;
        if (i > 0)
        	low = sums[i-1];
        return sums[j] - low;
    }

}
