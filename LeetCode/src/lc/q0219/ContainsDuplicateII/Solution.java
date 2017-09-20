/* Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * 
 */

package lc.q0219.ContainsDuplicateII;

import java.util.*;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++)
        {
        	if (map.containsKey(nums[i]))
        	{
        		int idx = map.get(nums[i]);
        		if (i - idx <= k)
        			return true;
        	}
        	map.put(nums[i], i);
        }
        return false;
    }
}
