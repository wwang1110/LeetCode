/* Given a collection of integers that might contain duplicates, nums, return all possible subsets.
 * 
 * Note: The solution set must not contain duplicate subsets.
 * 
 * For example,
 * 
 * If nums = [1,2,2], a solution is:
 * 
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 * 
 */

package lc.q0090.SubsetsII;
import java.util.*;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	Arrays.sort(nums);
    	boolean[] mask = new boolean[nums.length];
    	generateSubset(0, new ArrayList<Integer>(), mask, res, nums);
    	return res;
    }

	private void generateSubset(int i, ArrayList<Integer> l, boolean[] mask, List<List<Integer>> res, int[] nums) {
		if (i == nums.length)
		{
			res.add(new ArrayList<Integer>(l));
			return;
		}
		generateSubset(i + 1, l, mask, res, nums);
		
		if (i > 0 && nums[i] == nums[i-1] && mask[i-1] == false)
			return;
		
		l.add(nums[i]);
		mask[i] = true;
		generateSubset(i + 1, l, mask, res, nums);
		mask[i] = false;
		l.remove(l.size() - 1);
	}

}
