//Write a function to find the longest common prefix string amongst an array of strings.


package lc.q0014.LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
    	
    	if (strs.length == 0)
    		return "";
    	
    	if (strs.length == 1)
    		return strs[0];
    	
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < strs[0].length(); i ++)
        {
        	Character c = strs[0].charAt(i);
        	for(int j = 1; j < strs.length; j ++)
        	{
        		if (i < strs[j].length() && c == strs[j].charAt(i))
        			continue;
        		return sb.toString();
        	}
        	sb.append(c);
        }
        return sb.toString();
    }
}
