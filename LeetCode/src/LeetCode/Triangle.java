package LeetCode;

import java.util.ArrayList;

public class Triangle {
	//Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

	//For example, given the following triangle
	//[
	//     [2],
	//    [3,4],
	//   [6,5,7],
	//  [4,1,8,3]
	//]
	//The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

	//Note:
	//Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
    	if (triangle.size() == 0)
    		return 0;
    	
    	int minpath[] = new int[triangle.size()];
    	minpath[0] = triangle.get(0).get(0);
    	for (int i = 1; i < minpath.length; i++)
    		for (int j = i; j >= 0; j--)
    		{
    			if (j == i)
    				minpath[j] =  minpath[j-1] + triangle.get(i).get(j);
    			else if (j == 0)
    				minpath[j] =  minpath[j] + triangle.get(i).get(j);
    			else
    				minpath[j] =  Math.min(minpath[j - 1], minpath[j]) + triangle.get(i).get(j);
    		}
    	
    	int min = minpath[0];
    	for (int i = 0; i < minpath.length; i++)
    		min = Math.min(min, minpath[i]);
    	
    	return min;
    }	
}
