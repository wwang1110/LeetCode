/* Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
 * 
 * Example 1:
 * Input: [3, 2, 1]
 * Output: 1
 * Explanation: The third maximum is 1.
 * 
 * Example 2:
 * Input: [1, 2]
 * Output: 2
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * 
 * Example 3:
 * Input: [2, 2, 3, 1]
 * Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 */
package lc.q0414.ThirdMaximumNumber;

import java.util.*;

public class Solution {
    public int thirdMax(int[] nums) {
    	Set<Integer> set = new HashSet<Integer>();
    	int i=0;
    	while(i<nums.length)
    	{
    		if(set.size()<3)
    			set.add(nums[i]);
    		else if (!set.contains(nums[i]))
    		{
    			int min=Integer.MAX_VALUE;
    			for(Integer n:set)
    				min=Math.min(min, n);
    			if(nums[i]>min)
    			{
    				set.remove(min);
    				set.add(nums[i]);
    			}
    		}
    		i++;
    	}
    	if(set.size()<3)
    	{
    		int max=Integer.MIN_VALUE;
    		for(Integer n:set)
    			max=Math.max(max, n);
    		return max;
    	}
		int ret=Integer.MAX_VALUE;
		for(Integer n:set)
			ret=Math.min(ret, n);
    	return ret;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.thirdMax(new int[] {5,2,4,1,3,6,0});
    }
}
