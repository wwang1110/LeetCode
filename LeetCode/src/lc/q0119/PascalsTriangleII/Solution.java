/* Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 * 
 */

package lc.q0119.PascalsTriangleII;

import java.util.*;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
    	int[] row = new int[rowIndex+1];
        for (int i = 0; i <= rowIndex; i++)
        {
        	for (int j = i; j >= 0; j--)
        	{
        		if (j == 0)
        			row[j] = 1;
        		else
        			row[j] += row[j-1];
        	}
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < row.length; i++)
        	res.add(row[i]);
        return res;
    }
}
