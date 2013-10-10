package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
	//Given a set of candidate numbers (C) and a target number (T), 
	//find all unique combinations in C where the candidate numbers sums to T.

	//The same repeated number may be chosen from C unlimited number of times.

	//Note:
	//All numbers (including target) will be positive integers.
	//Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 <= a2 <= … <= ak).
	//The solution set must not contain duplicate combinations.
	//For example, given candidate set 2,3,6,7 and target 7, 
	//A solution set is: 
	//[7] 
	//[2, 2, 3] 
	ArrayList<ArrayList<Integer>> ret = null;
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
    	ret = new ArrayList<ArrayList<Integer>>();
    	Arrays.sort(candidates);
    	if (target != 0)
    		combSum(candidates, new ArrayList<Integer>(), 0, target);
    	return ret;
    }
    @SuppressWarnings("unchecked")
	private void combSum(int[] candidates, ArrayList<Integer> list, int idx, int target){
    	if (target == 0)
    	{
    		ret.add((ArrayList<Integer>)list.clone());
    		return;
    	}
    	for (int i = idx; i < candidates.length && candidates[i] <= target; i++)
    	{
    		list.add(candidates[i]);
    		combSum(candidates, list, i, target - candidates[i]);
    		list.remove(list.size() - 1);
    	}
    }
}
