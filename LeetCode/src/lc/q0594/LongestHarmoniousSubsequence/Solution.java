/* We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.
 * 
 * Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.
 * Example 1:
 * Input: [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * Note: The length of the input array will not exceed 20,000.
 * 
 */
package lc.q0594.LongestHarmoniousSubsequence;

import java.util.*;

public class Solution {
	class Number
	{
		public int val;
		public int count;
		public Number(int v, int c)
		{
			val=v;
			count=c;
		}
	}
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        	if(map.containsKey(nums[i]))
        		map.put(nums[i], map.get(nums[i])+1);
        	else
        		map.put(nums[i], 1);
        List<Number> list=new ArrayList<Number>();
        for(int key:map.keySet())
        	list.add(new Number(key, map.get(key)));
        Collections.sort(list, (a, b)->a.val-b.val);
        int maxlen=0;
        for(int i=0;i<list.size()-1;i++)
        {
    		if(Math.abs(list.get(i).val-list.get(i+1).val)==1)
    			maxlen=Math.max(list.get(i).count+list.get(i+1).count, maxlen);
        }
        return maxlen;
    }
}
