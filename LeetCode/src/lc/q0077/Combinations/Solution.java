/* Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * For example,
 * If n = 4 and k = 2, a solution is:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 */

package lc.q0077.Combinations;

import java.util.*;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if (k > n)
    		return res;
    	combine(n, k, new ArrayList<Integer>(), res);
    	
    	return res;
    }

	private void combine(int n, int k, List<Integer> comb, List<List<Integer>> res) {
		if (k == 0)
		{
			res.add(new ArrayList<Integer>(comb));
			return;
		}
		
		if (n == 0)
			return;
		
		combine(n-1, k, comb, res);
		
		comb.add(n);
		combine(n-1, k-1, comb, res);
		comb.remove(comb.size()-1);
	}
}
