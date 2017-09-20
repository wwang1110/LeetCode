/* asing subsequence should be at least 2 .
 * 
 * Example:
 * Input: [4, 6, 7, 7]
 * Output: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]]
 * Note:
 * The length of the given array will not exceed 15.
 * The range of integer in the given array is [-100,100].
 * The given array may contain duplicates, and two equal integers should also be considered as a special case of increasing sequence.
 * 
 */

package lc.q0491.IncreasingSubsequences;

import java.util.*;

public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	boolean[] masks=new boolean[201];
    	generateSubsequences(new ArrayList<Integer>(),0,masks,nums,res);
    	return res;
    }

	private void generateSubsequences(ArrayList<Integer> list, int i, boolean[] masks, int[] nums,
			List<List<Integer>> res) {
		if (i==nums.length)
			return;
		if((list.isEmpty()||list.get(list.size()-1)<=nums[i])&&masks[nums[i]+100]==false)
		{
			list.add(nums[i]);
			if(list.size()>1)
				res.add(new ArrayList<Integer>(list));
			generateSubsequences(list, i+1, masks, nums, res);
			list.remove(list.size()-1);
		}
		masks[nums[i]+100]=true;
		generateSubsequences(list, i+1, masks, nums, res);
		masks[nums[i]+100]=false;
	}
}
