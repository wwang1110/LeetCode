package LeetCode;

import java.util.Set;

public class WordBreak {
	//Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

	//For example, given
	//s = "leetcode",
	//dict = ["leet", "code"].

	//Return true because "leetcode" can be segmented as "leet code".
    public boolean wordBreak(String s, Set<String> dict) {
    	if (s.isEmpty())
    		return false;
    	
    	int len = s.length();
    	boolean[] marks = new boolean[len + 1];
    	marks[0] = true;
    	
    	for (int i = 0; i < len; i++)
    	{
    		if (marks[i] == false)
    			continue;
    		
    		for (String str : dict)
    		{
    			if (str.length() + i <= len && str.equals(s.substring(i, str.length() + i)))
    			{
    				marks[str.length() + i] = true;
	    			if (str.length() + i == len)
	    				return true;
    			}
    		}
    	}
    	
    	return false;
    }	
}
