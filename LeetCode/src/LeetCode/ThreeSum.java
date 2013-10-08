package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ThreeSum {
	//Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

	//Note:
	//Elements in a triplet (a,b,c) must be in non-descending order. (ie, a <= b <= c)
	//The solution set must not contain duplicate triplets.
	//For example, given array S = {-1 0 1 2 -1 -4},

	//A solution set is:
	//(-1, 0, 1)
	//(-1, -1, 2)
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
    	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    	HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < num.length; i++)
        {
        	for (int j = i + 1; j < num.length; j++)
        	{
        		if (set.contains(-num[i]-num[j]))
        		{
        			ArrayList<Integer> triplet = new ArrayList<Integer>();
        			triplet.add(-num[i]-num[j]);
        			triplet.add(num[i]);
        			triplet.add(num[j]);
        			Collections.sort(triplet);
        			boolean dup = false;
        			for (ArrayList<Integer> t : ret)
        			{
        				if (t.get(0) == triplet.get(0) && t.get(1) == triplet.get(1) && t.get(2) == triplet.get(2))
        					dup = true;
        			}
        			if (dup == false)
        				ret.add(triplet);
        		}
        	}
        	set.add(num[i]);
        }
        return ret;
    }
}
