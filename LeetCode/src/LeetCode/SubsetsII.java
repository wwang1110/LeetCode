package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsII {
	//Given a collection of integers that might contain duplicates, S, return all possible subsets.

	//Note:
	//Elements in a subset must be in non-descending order.
	//The solution set must not contain duplicate subsets.
	//For example,
	//If S = [1,2,2], a solution is:
	//[
	//  [2],
	//  [1],
	//  [1,2,2],
	//  [2,2],
	//  [1,2],
	//  []
	//]	
	private ArrayList<ArrayList<Integer>> ret;
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
    	ret = new ArrayList<ArrayList<Integer>>();
    	Arrays.sort(num);
    	subsetsWithDup(num, 0, new ArrayList<Integer>());
    	return ret;
    }
    private void subsetsWithDup(int[] num, int idx, ArrayList<Integer> cur)
    {
    	if (idx == num.length) 
    		ret.add(cur);
    	else
    	{
	    	int rep = 0;
	    	while(idx+rep<num.length && num[idx] == num[idx+rep])
	    		rep++;
	    	
	    	for (int i = 0; i <= rep; i++)
	    	{
	    		@SuppressWarnings("unchecked")
				ArrayList<Integer> newset = (ArrayList<Integer>)cur.clone();
	    		for (int j = 0; j < i; j++)
	    			newset.add(num[idx]);
	    		subsetsWithDup(num, idx+rep, newset);
	    	}
    	}
    }
}
