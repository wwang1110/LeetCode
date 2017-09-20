/* iven an integer n, return 1 - n in lexicographical order.
 * 
 * For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
 * 
 * Please optimize your algorithm to use less time and space. The input size may be as large as 5,000,000.
 * 
 */

package lc.q0386.LexicographicalNumbers;

import java.util.*;

public class Solution {
    public List<Integer> lexicalOrder(int n) {
    	List<Integer> res = new ArrayList<Integer>();
    	generateNumbers(0, n, res);
    	return res;
    }

	private void generateNumbers(int num, int n, List<Integer> res) {
		for(int i=0;i<10;i++)
		{
			int nnum=num*10+i;
			if (nnum!=0&&nnum<=n)
			{
				res.add(nnum);
				generateNumbers(nnum, n, res);
			}
		}
	}
}
