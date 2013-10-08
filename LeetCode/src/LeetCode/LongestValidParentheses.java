package LeetCode;

import java.util.Stack;

public class LongestValidParentheses {
	//Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

	//For "(()", the longest valid parentheses substring is "()", which has length = 2.

	//Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
    public int longestValidParentheses(String s) {
    	Stack<Integer> stack = new Stack<Integer>();
    	int len = s.length();
    	int marks[] = new int[len];
    	for (int i = 0; i < len; i++)
    	{
    		if (s.charAt(i) == '(')
    			stack.push(i);
    		else
    		{
    			if (stack.isEmpty() == false)
    			{
    				int left = stack.pop();
    				marks[i] = i - left + 1; 
    			}
    			else
    				stack.clear();
    		}
    	}
    	for (int i = 1; i < len; i++)
    		if (marks[i] != 0 && i - marks[i] >= 0)
    			marks[i] = marks[i] + marks[i - marks[i]];
    	int ret = 0;
    	for (int i = 1; i < len; i++)
    		ret = Math.max(ret, marks[i]);
    	return ret;
    }
}
