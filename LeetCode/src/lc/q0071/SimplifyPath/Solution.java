/* Given an absolute path for a file (Unix-style), simplify it.
 * 
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 * click to show corner cases.
 * 
 */

package lc.q0071.SimplifyPath;

import java.util.*;

public class Solution {
    public String simplifyPath(String path) {
    	
    	String[] dirs = path.split("/");
    	List<String> list = new ArrayList<String>();
    	for (int i = 0; i < dirs.length; i++)
    	{
    		if (dirs[i].equals("")||dirs[i].equals("."))
    			continue;
    		else if (dirs[i].equals(".."))
    		{
    			if (list.size()>0)
    				list.remove(list.size()-1);
    		}
    		else
    			list.add(dirs[i]);
    	}
    	
    	String res = "";
    	for(int i = 0; i < list.size(); i++)
    		res += "/" + list.get(i);
    	if (res.equals(""))
    		return "/";
    	return res;
    }
}
