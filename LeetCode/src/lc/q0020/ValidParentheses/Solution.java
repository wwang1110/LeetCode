/* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 */

package lc.q0020.ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
    	Stack<Character> stk = new Stack<Character>();
    	for(int i = 0; i < s.length(); i++)
    	{
    		if (s.charAt(i) == '{'||s.charAt(i) == '('||s.charAt(i) == '[')
    			stk.push(s.charAt(i));
    		else
    		{
    			if (stk.isEmpty())
    				return false;
    			
    			Character c = stk.pop();
    			if ((s.charAt(i) == '}' && c != '{')
    				||(s.charAt(i) == ')' && c != '(')
    				||(s.charAt(i) == ']' && c != '['))
    				return false;
    		}
    	}
    	
    	return stk.isEmpty();
    }
}
