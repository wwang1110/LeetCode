package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {
	//Given an array S of n integers, find three integers in S such that the sum is closest to a given number, 
	//target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    //For example, given array S = {-1 2 1 -4}, and target = 1.

    //The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
	
    public int threeSumClosest(int[] num, int target) {
    	int ret = 0;
    	boolean init = false;
    	
    	Arrays.sort(num);
    	for (int i = 0; i < num.length; i++)
    	{
    		int j = i + 1;
    		int k = num.length - 1;
    		while (j < k)
    		{
        		int delta = num[i] + num[j] + num[k] - target;
        		int dist = Math.abs(delta);
        		if (dist < Math.abs(ret - target) || init == false)
        		{
        			init = true;
        			ret = num[i] + num[j] + num[k];
        		}

        		if (delta < 0)
        			j++;
        		else
        			k--;
    		}
    	}
    	return ret; 
    }
}
