/* Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5,
 * 
 * Return
 [
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
 ]
 * 
 */

package lc.q0118.PascalTriangle;

import java.util.List;
import java.util.*;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 0)
            return res;
        
        res.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i ++)
        {
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> preRow = res.get(i-1);
            for (int j = 0; j <= i; j++)
            {
                if (j == 0) row.add(1);
                else if (j == i) row.add(1);
                else row.add(preRow.get(j-1)+preRow.get(j));
            }
            res.add(row);
        }
        
        return res;
    }
}