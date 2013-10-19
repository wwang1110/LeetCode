package LeetCode;

import java.util.ArrayList;

public class PascalsTriangle {
	//Given numRows, generate the first numRows of Pascal's triangle.

	//For example, given numRows = 5,
	//Return

	//[
	//     [1],
	//    [1,1],
	//   [1,2,1],
	//  [1,3,3,1],
	// [1,4,6,4,1]
	//]
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
    	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    	if (numRows == 0)
    		return ret;

    	for (int i = 0; i < numRows; i++)
    	{
    		ArrayList<Integer> row = new ArrayList<Integer>();
    		for (int j = 0; j <= i; j++)
    		{
    			if (j == 0 || j == i)
    				row.add(1);
    			else
    				row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
    		}
    		ret.add(row);
    	}
    	
    	return ret;
    }
}
