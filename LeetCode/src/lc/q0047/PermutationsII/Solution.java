/* Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * For example,
 * [1,1,2] have the following unique permutations:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 * 
 */

package lc.q0047.PermutationsII;
import java.util.*;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
    	
    	Arrays.sort(nums);
    	
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
				if (i == 0
					|| nums[i] != nums[i-1]
					|| ftb[i-1] == 1)
				{
					l.add(nums[i]);
					ftb[i] = 1;
					permute(l, ftb, res, nums);
					ftb[i] = 0;
					l.remove(l.size()-1);
				}
			}
	}
}
