package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
	//Given a collection of numbers, return all possible permutations.

	//For example,
	//[1,2,3] have the following permutations:
	//[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
	ArrayList<ArrayList<Integer>> ret = null;
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
    	ret = new ArrayList<ArrayList<Integer>>();
    	Arrays.sort(num);
    	permute(num, new int[num.length], new ArrayList<Integer>());
    	return ret;
    }	
    @SuppressWarnings("unchecked")
	private void permute(int[] num, int[] marks, ArrayList<Integer> list)
    {
    	if (list.size() == num.length)
    		ret.add((ArrayList<Integer>)list.clone());
    	
    	for (int i = 0; i < num.length; i++)
    		if (marks[i] == 0)
    		{
    			marks[i] = 1;
    			list.add(num[i]);
    			permute(num, marks, list);
    			list.remove(list.size() - 1);
    			marks[i] = 0;
    		}
    	
    }
}
