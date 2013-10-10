package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumII {
	//Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

	//Each number in C may only be used once in the combination.

	//Note:
	//All numbers (including target) will be positive integers.
	//Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 <= a2 <= … <= ak).
	//The solution set must not contain duplicate combinations.
	//For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
	//A solution set is: 
	//[1, 7] 
	//[1, 2, 5] 
	//[2, 6] 
	//[1, 1, 6] 
	ArrayList<ArrayList<Integer>> ret = null;
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
    	ret = new ArrayList<ArrayList<Integer>>();
    	Arrays.sort(num);
    	if (target != 0)
    		combSum(num, new ArrayList<Integer>(), 0, target);
    	return ret;
    }
    @SuppressWarnings("unchecked")
	private void combSum(int[] candidates, ArrayList<Integer> list, int idx, int target){
    	if (target == 0)
    	{
    		ret.add((ArrayList<Integer>)list.clone());
    		return;
    	}
    	if (target > 0 && idx < candidates.length)
    	{
    		int cnt = 0;
    		while(idx + cnt < candidates.length && candidates[idx] == candidates[idx + cnt])
    			cnt++;
    		
    		for (int i = 0; i < cnt; i++)
    		{
    			list.add(candidates[idx]);
    			combSum(candidates, list, idx + cnt, target - candidates[idx] * (i + 1));
    		}
			
    		while (list.isEmpty() == false && list.get(list.size() - 1) == candidates[idx])
    			list.remove(list.size() - 1);
			
			combSum(candidates, list, idx + cnt, target);
    	}
    }
}
