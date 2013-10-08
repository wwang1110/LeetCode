package LeetCode;

import java.util.Stack;

public class ValidParentheses {
	//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
	//determine if the input string is valid.

	//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	for (int i = 0; i < s.length(); i++)
    	{
    		Character c = s.charAt(i);
    		if (c == '(' || c == '{' || c == '[')
    			stack.push(c);
    		else
    		{
    			Character p = ' ';
    			if (!stack.isEmpty())
    				p = stack.pop();
    			if (!((c == ')' && p == '(')||(c == '}' && p =='{')||(c == ']' && p == '[')))
    				return false;
    		}
    	}
    	if (stack.isEmpty())
    		return true;
    	return false;
    }	
}
