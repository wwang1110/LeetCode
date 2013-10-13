package LeetCode;

import java.util.ArrayList;

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
    	path = path.replace("//", "/");
    	if (path.charAt(path.length() - 1) == '/')
    		path = path.substring(0, path.length() - 1);
    	
    	String paths[] = path.split("/");
    	
    	ArrayList<String> cur = new ArrayList<String>(); 
    	
    	for (int i = 0; i < paths.length; i++)
    		if (paths[i].equals(""))
    		{
    			//do nth
    		}
    		else if (paths[i].equals(".."))
    		{
    			if (cur.isEmpty() == false)
    				cur.remove(cur.size() - 1);
    		}
    		else if (paths[i].equals("."))
    		{
    		}
    		else
    		{
    			cur.add(paths[i]);
    		}
    	
    	String ret = "";
    	for (int i = 0; i < cur.size(); i++)
    		ret += "/" + cur.get(i);
    	
    	if (ret.equals(""))
    		ret = "/";
    	
    	return ret;
    }	
}
