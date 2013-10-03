package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
	//Given a set of distinct integers, S, return all possible subsets.

	//Note:
	//Elements in a subset must be in non-descending order.
	//The solution set must not contain duplicate subsets.
	//For example,
	//If S = [1,2,3], a solution is:

	//[
	//  [3],
	//  [1],
	//  [2],
	//  [1,2,3],
	//  [1,3],
	//  [2,3],
	//  [1,2],
	//  []
	//]
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
    	Arrays.sort(S);
    	int x = (int)Math.pow(2, S.length);
    	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    	for (int i = 0; i < x; i++)
    	{
    		ArrayList<Integer> set = new ArrayList<Integer>();
    		int k = i;
    		int j = 0;
    		while (k > 0)
    		{
    			if ((k & 1) == 1) set.add(S[j]);
    			k = k >> 1;
    			j++;
    		}
    		ret.add(set);
    	}
    	return ret;
    }	
}
