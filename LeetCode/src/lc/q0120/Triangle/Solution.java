/* Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 * 
 * For example, given the following triangle
 * [
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 * 
 */

package lc.q0120.Triangle;
import java.util.*;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    	int len = triangle.size();
    	if (len == 0)
    		return 0;
        int[] mp = new int[len];
        for (int i = 0; i < len; i++)
        {
    		for(int j = i; j>=0; j--)
    		{
    			if(j==0)
    				mp[j] += triangle.get(i).get(j);
    			else if (j==i)
    				mp[j] = mp[j-1] + triangle.get(i).get(j);
    			else
    				mp[j] = Math.min(mp[j], mp[j-1]) + triangle.get(i).get(j);
    		}
        }
        
        int minPath = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++)
        	minPath = Math.min(minPath, mp[i]);
        
        return minPath;
    }
}
