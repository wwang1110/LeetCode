package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
	//Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

	//For example,
	//Given [100, 4, 200, 1, 3, 2],
	//The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

	//Your algorithm should run in O(n) complexity.
    public int longestConsecutive(int[] num) {
    	
    	Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    	
    	for (int n : num)
    		map.put(n, false);
    	
    	int maxLen = 0;
    	for (int n : num)
    	{
    		if (map.get(n) == true)
    			continue;
    		
    		//current node
    		int idx = n;
			map.put(idx, true);
    		int count = 1;
    		
    		//scan left
    		while (map.containsKey(--idx))
    		{
    			map.put(idx, true);
    			count++;
    		}
    		
    		//scan right
    		idx = n;
    		while (map.containsKey(++idx))
    		{
    			map.put(idx, true);
    			count++;
    		}
    		
    		maxLen = Math.max(maxLen, count);
    	}
    	
    	return maxLen;
    }	
}
