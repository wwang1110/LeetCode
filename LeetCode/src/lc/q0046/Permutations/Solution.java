/* Given a collection of distinct numbers, return all possible permutations.
 * For example,
 * [1,2,3] have the following permutations:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */

package lc.q0046.Permutations;
import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
    	
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        int[] ftb = new int[nums.length];
        
        permute(new ArrayList<Integer>(), ftb, res, nums);
        
        return res;
    }

	private void permute(ArrayList<Integer> l, int[] ftb, List<List<Integer>> res, int[] nums) {
		if (l.size() == nums.length)
		{
			res.add(new ArrayList<Integer>(l));
			return;
		}
		
		for (int i = 0; i < nums.length; i ++)
			if (ftb[i] == 0)
			{
				l.add(nums[i]);
				ftb[i] = 1;
				permute(l, ftb, res, nums);
				ftb[i] = 0;
				l.remove(l.size()-1);
			}
	}
}
