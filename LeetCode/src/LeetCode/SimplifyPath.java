package LeetCode;

import java.util.Stack;

public class SimplifyPath {
	//Given an absolute path for a file (Unix-style), simplify it.

	//For example,
	//path = "/home/", => "/home"
	//path = "/a/./b/../../c/", => "/c"
	//click to show corner cases.

	//Corner Cases:
	//Did you consider the case where path = "/../"?
	//In this case, you should return "/".
	//Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
	//In this case, you should ignore redundant slashes and return "/home/foo".
    public String simplifyPath(String path) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	Stack<String> stack = new Stack<String>();
    	String elements[] = path.split("/");
    	for (int i = 0; i < elements.length; i++)
    	{
    		if (!elements[i].isEmpty() && !elements[i].equals("."))
    		{
    			if (elements[i].equals(".."))
    			{
    				if(!stack.isEmpty())
    					stack.pop();
    			}
    			else
    				stack.push(elements[i]);
    		}
    	}
    	
    	if (stack.isEmpty())
    		return "/";
    	
    	String ret = "";
    	while(!stack.isEmpty())
    	{
    		ret = "/" + stack.pop() + ret;
    	}
    	return ret;
    }	
}
