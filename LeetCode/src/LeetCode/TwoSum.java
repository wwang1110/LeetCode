package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	/*
	Given an array of integers, find two numbers such that they add up to a specific target number.
	The function twoSum should return indices of the two numbers such that they add up to the target, 
	where index1 must be less than index2. Please note that your returned answers (both index1 and index2) 
	are not zero-based.
	You may assume that each input would have exactly one solution.
	 */
    public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int ret[] = new int[2];
		for (int i = 0; i < numbers.length; i++)
		{
			if (map.containsKey(numbers[i]))
			{
				ret[0] = map.get(numbers[i]) + 1;
				ret[1] = i + 1;
				break;
			}
			else
			{
				map.put(target - numbers[i], i);
			}
		}
		
		return ret;
    }
}
