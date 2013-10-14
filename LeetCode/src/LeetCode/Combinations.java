package LeetCode;

import java.util.ArrayList;

public class Combinations {
	//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

	//For example,
	//If n = 4 and k = 2, a solution is:
	//[
	//  [2,4],
	//  [3,4],
	//  [2,3],
	//  [1,2],
	//  [1,3],
	//  [1,4],
	//]
	private ArrayList<ArrayList<Integer>> ret = null;
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	ret = new ArrayList<ArrayList<Integer>>();
    	combine(n, k, 1, new ArrayList<Integer>());
    	return ret;
        
    }	
    @SuppressWarnings("unchecked")
	private void combine(int n, int k, int num, ArrayList<Integer> cur) {
    	
    	if (cur.size() == k)
    	{
    		ret.add((ArrayList<Integer>) cur.clone());
    		return;
    	}

    	if (num > n)
    		return;
    	
    	cur.add(num);
    	combine(n, k, num + 1, cur);
    	cur.remove(cur.size() - 1);
    	
    	combine(n, k, num + 1, cur);
    }	
}
