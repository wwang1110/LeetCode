/* Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */

package lc.q0022.GenerateParentheses;

import java.util.*;

public class Solution {
	
    public List<String> generateParenthesis(int n) {
    	
    	List<String> res = new ArrayList<String>();
    	
    	generateParenthesis("", n, n, res);
    	
    	return res;
    }

	void generateParenthesis(String str, int left, int right, List<String> res) {
		
		if (left == 0 && right == 0)
		{
			res.add(str);
			return;
		}
		
		if (left > 0)
			generateParenthesis(str + '(', left-1, right, res);
		
		if (right > left)
			generateParenthesis(str + ')', left, right-1, res);
	}
}
