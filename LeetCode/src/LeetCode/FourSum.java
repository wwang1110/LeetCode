package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class FourSum {
	//Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

	//Note:
	//Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a <= b <= c <= d)
	//The solution set must not contain duplicate quadruplets.
	//For example, given array S = {1 0 -1 0 -2 2}, and target = 0.

	//A solution set is:
	//(-1,  0, 0, 1)
	//(-2, -1, 1, 2)
	//(-2,  0, 0, 2)
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
    	HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
    	Arrays.sort(num);
    	
    	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    	for (int i = 0; i < num.length; i++)
    		for (int j = i + 1; j < num.length; j++)
    		{
    			if (map.containsKey(-num[i]-num[j]))
    			{
    				ArrayList<Integer> t = map.get(-num[i]-num[j]);
    				if (t.get(0) != i && t.get(0) != j && t.get(1) != i && t.get(1) != j)
    				{
        				ArrayList<Integer> quadruplet = new ArrayList<Integer>();
        				quadruplet.add(num[t.get(0)]);
        				quadruplet.add(num[t.get(1)]);
        				quadruplet.add(num[i]);
        				quadruplet.add(num[j]);
        				Collections.sort(quadruplet);
        				
        				boolean dup = false;
        				for (ArrayList<Integer> q : ret)
        				{
        					if (q.get(0) == quadruplet.get(0) && q.get(1) == quadruplet.get(1)
        						&&q.get(2) == quadruplet.get(2) && q.get(3) == quadruplet.get(3))
        						dup = true;
        				}
        				if (dup == false)
        					ret.add(quadruplet);
    				}
    			}
    		}
    	return ret;
    }
}
