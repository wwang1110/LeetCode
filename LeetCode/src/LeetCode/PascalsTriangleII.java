package LeetCode;

import java.util.ArrayList;

public class PascalsTriangleII {
	//Given an index k, return the kth row of the Pascal's triangle.

	//For example, given k = 3,
	//Return [1,3,3,1].

	//Note:
	//Could you optimize your algorithm to use only O(k) extra space?
    public ArrayList<Integer> getRow(int rowIndex) {
    	ArrayList<Integer> ret = new ArrayList<Integer>();
    	int nums[] = new int[rowIndex + 1];
    	for (int i = 0; i <= rowIndex; i++)
    		for (int j = i; j >= 0; j--)
    		{
    			if (j == i || j == 0)
    				nums[j] = 1;
    			else
    				nums[j] = nums[j] + nums[j - 1];
    		}
    	for (int i = 0; i < rowIndex + 1; i++)
    		ret.add(nums[i]);
    	return ret;
    }	
}
