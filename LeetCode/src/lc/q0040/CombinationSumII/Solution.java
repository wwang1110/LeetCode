/* Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 * Each number in C may only be used once in the combination.
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 * A solution set is:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 */

package lc.q0040.CombinationSumII;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	
    	Arrays.sort(candidates);
    	
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	int[] ftb = new int[candidates.length];
    	
    	combinationSum2(target, 0, new ArrayList<Integer>(), res, ftb, candidates);
    	
    	return res;
    }

	public void combinationSum2(int target, int i, ArrayList<Integer> l, List<List<Integer>> res,
			int[] ftb, int[] candidates) {
		
		if (target == 0)
		{
			res.add(new ArrayList<Integer>(l));
			return;
		}
		
		if (target < 0 || i >= candidates.length)
			return;

		if (i == 0 
			|| candidates[i] != candidates[i-1] 
			|| candidates[i] == candidates[i-1] && ftb[i-1] == 1)
		{
			l.add(candidates[i]);
			ftb[i] = 1;
			
			combinationSum2(target - candidates[i], i + 1, l, res, ftb, candidates);
			
			ftb[i] = 0;
			l.remove(l.size()-1);
		}
		combinationSum2(target, i + 1, l, res, ftb, candidates);

	}
}
