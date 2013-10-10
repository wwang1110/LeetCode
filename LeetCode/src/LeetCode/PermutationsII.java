package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsII {
	//Given a collection of numbers that might contain duplicates, return all possible unique permutations.

	//For example,
	//[1,1,2] have the following unique permutations:
	//[1,1,2], [1,2,1], and [2,1,1].
	ArrayList<ArrayList<Integer>> ret = null;
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
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
    		if (marks[i] == 1 || i > 0 && num[i] == num[i-1] && marks[i-1] == 0)
    			continue;
    		else
    		{
    			marks[i] = 1;
    			list.add(num[i]);
    			permute(num, marks, list);
    			list.remove(list.size() - 1);
    			marks[i] = 0;
    		}
    	
    }
}
