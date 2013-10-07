package LeetCode;

public class LongestCommonPrefix {
	//Write a function to find the longest common prefix string amongst an array of strings.
    public String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0)
    		return "";
    	
    	String prefix = null;
    	for (String str : strs)
    		if (prefix == null || str.length() < prefix.length())
    			prefix = str;
    	while(prefix.length() > 0)
    	{
    		int match = 0;
    		for (int j = 0; j < strs.length; j++)
    			if (strs[j].substring(0, prefix.length()).equals(prefix) == false)
    				break;
    			else
    				match++;
    		if (match == strs.length)
    			break;
    		else
    			prefix = prefix.substring(0, prefix.length() - 1);
    	}
    	return prefix;
    }	
}
