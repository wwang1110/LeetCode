package LeetCode;

import java.util.Stack;

public class LongestValidParentheses {
	//Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

	//For "(()", the longest valid parentheses substring is "()", which has length = 2.

	//Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
    public int longestValidParentheses(String s) {
    	Stack<Integer> stack = new Stack<Integer>();
    	Stack<Character> stackc = new Stack<Character>();
    	int len = s.length();
    	int ret = 0;
    	for (int i = 0; i < len; i++)
    	{
    		if (s.charAt(i) == '(')
    		{
    			stack.push(i);
    			stackc.push('(');
    		}
    		else
    		{
    			if (stack.isEmpty() == false && stackc.peek() == '(')
    			{
					stack.pop();
					stackc.pop();
					if (stack.isEmpty())
						ret = i + 1;
					else
						ret = Math.max(i - stack.peek(), ret);
    			}
				else
				{
					stack.push(i);
					stackc.push(')');
				}
    		}
    	}
    	return ret;
    }
}
