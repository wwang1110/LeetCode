package LeetCode;

import java.util.ArrayList;

public class GenerateParentheses {
	//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

	//For example, given n = 3, a solution set is:

	//"((()))", "(()())", "(())()", "()(())", "()()()"

	ArrayList<String> ret = null;
    public ArrayList<String> generateParenthesis(int n) {
    	ret = new ArrayList<String>();
    	generateParenthesis("", n, 0);
    	return ret;
    }
    public void generateParenthesis(String s, int left, int right) {
    	if (left == 0)
    	{
    		while (right-- > 0)
    			s += ")";
    		ret.add(s);
    	}
    	else
    	{
    		generateParenthesis(s+"(", left - 1, right + 1);
    		if (right > 0)
    			generateParenthesis(s+")", left, right - 1);
    	}
    }
}
