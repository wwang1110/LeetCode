/* Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 * 
 * Example 1:
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 * 
 * Example 2:
 * Input: [0,1,0]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * Note: The length of the given binary array will not exceed 50,000.
 * 
 */
package lc.q0525.ContiguousArray;

import java.util.*;

public class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        int maxlen=0;
        int ones=0;
        int zeros=0;
        map.put(0, -1);
        for(int i=0;i<nums.length;i++)
        {
        	if(nums[i]==0)
        		ones++;
        	else
        		zeros++;
        	int diff=ones-zeros;
        	if(map.containsKey(diff))
        		maxlen=Math.max(maxlen,i-map.get(diff));
        	else
        		map.put(diff, i);
        }
        return maxlen;
    }
}
