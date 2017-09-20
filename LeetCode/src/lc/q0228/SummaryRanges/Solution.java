/*Given a sorted integer array without duplicates, return the summary of its ranges.
 * 
 * Example 1:
 * 
 * Input: [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * 
 * 
 * Example 2:
 * Input: [0,2,3,4,6,8,9]
 * Output: ["0","2->4","6","8->9"]
 * 
 */

package lc.q0228.SummaryRanges;

import java.util.*;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
    	List<List<Integer>> ranges = new ArrayList<List<Integer>>();
        for (int l = 0, r = 1; r <= nums.length; r++)
        {
        	if (r == nums.length || nums[r] > nums[r-1] + 1)
        	{
        		ranges.add(Arrays.asList(nums[l], nums[r-1]));
        		l = r;
        	}
        }
        
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < ranges.size(); i++)
        {
        	if (ranges.get(i).get(0).equals(ranges.get(i).get(1)))
        		res.add(ranges.get(i).get(0).toString());
        	else
        		res.add(ranges.get(i).get(0).toString() + "->" + ranges.get(i).get(1).toString());
        }
        
        return res;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.summaryRanges(new int[] {-2147483648,-2147483647,2147483647});
    }
}
