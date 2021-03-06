/* Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
 * 
 * Example 1:
 * 
 * Input: k = 3, n = 7
 * Output:
 * [[1,2,4]]
 * 
 * Example 2:
 * Input: k = 3, n = 9
 * 
 * Output:
 * [[1,2,6], [1,3,5], [2,3,4]]
 * 
 */

package lc.q0216.CombinationSumIII;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        generateCombSum(0, k, n, new ArrayList<Integer>(), res);
        
        return res;
    }

	private void generateCombSum(int i, int k, int n, ArrayList<Integer> l, List<List<Integer>> res) {
		if (k == 0 && n == 0)
		{
			res.add(new ArrayList<Integer>(l));
			return;
		}
		
		if (k > 0 && n > 0)
		{
			for (int j = i+1; j < 10; j++)
			{
				l.add(j);
				generateCombSum(j, k-1, n-j, l, res);
				l.remove(l.size()-1);
			}
		}
	}
}
