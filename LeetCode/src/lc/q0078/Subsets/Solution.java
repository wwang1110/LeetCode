/* Given a set of distinct integers, nums, return all possible subsets.
 * 
 * Note: The solution set must not contain duplicate subsets.
 * 
 * For example,
 * If nums = [1,2,3], a solution is:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * 
 */

package lc.q0078.Subsets;

import java.util.*;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	generateSubset(0, new ArrayList<Integer>(), res, nums);
    	
    	return res;
    }

	private void generateSubset(int i, ArrayList<Integer> subset, List<List<Integer>> res, int[] nums) {
		if (i == nums.length)
		{
			res.add(new ArrayList<Integer>(subset));
			return;
		}
		
		generateSubset(i + 1, subset, res, nums);
		
		subset.add(nums[i]);

		generateSubset(i + 1, subset, res, nums);
		
		subset.remove(subset.size()-1);
	}
}
