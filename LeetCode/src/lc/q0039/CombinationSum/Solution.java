/* Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 * The same repeated number may be chosen from C unlimited number of times.
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [2, 3, 6, 7] and target 7,
 * A solution set is:
 * [
 *   [7],
 *   [2, 2, 3]
 * ]
 */

package lc.q0039.CombinationSum;

import java.util.*;

public class Solution {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	List<Integer> l = new ArrayList<Integer>();
    	
    	combinationSum(target, 0, l, res, candidates);
    	
    	return res;
    }

	public void combinationSum(int target, int i, List<Integer> l, List<List<Integer>> res, int[] candidates) {
		
		if (target == 0)
		{
			res.add(new ArrayList<Integer>(l));
			return;
		}
		
		if (target < 0 || i >= candidates.length)
			return;
		
		combinationSum(target, i + 1, l, res, candidates);
		
		l.add(candidates[i]);
		
		combinationSum(target - candidates[i], i, l, res, candidates);
		
		l.remove(l.size() - 1);
	}
}
