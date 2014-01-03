package LeetCode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	//Evaluate the value of an arithmetic expression in Reverse Polish Notation.

	//Valid operators are +, -, *, /. Each operand may be an integer or another expression.

	//Some examples:
	//  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
	//  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>(); 
        for (int i = 0; i < tokens.length; i++)
        {
        	if (!tokens[i].isEmpty())
        	{
        		if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
        		{
        			Integer b = s.pop();
        			Integer a = s.pop();
        			
        			if (tokens[i].equals("+"))
        				s.push(a + b);
        			else if (tokens[i].equals("-"))
        				s.push(a - b);
        			else if (tokens[i].equals("*"))
        				s.push(a * b);
        			else if (tokens[i].equals("/"))
        				s.push(a / b);
        				
        		}
        		else
        			s.push(Integer.parseInt(tokens[i]));
        	}
        }
        return s.pop();
    }
}
