package LeetCode;

import java.util.ArrayList;
import java.util.Set;

public class WordBreakII {
	//Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.

	//Return all such possible sentences.

	//For example, given
	//s = "catsanddog",
	//dict = ["cat", "cats", "and", "sand", "dog"].

	//A solution is ["cats and dog", "cat sand dog"].
    public ArrayList<String> wordBreak(String s, Set<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	
    	ArrayList<String> ret = new ArrayList<String>();
    	if (s.isEmpty())
    		return ret;

    	int len = s.length();
    	ArrayList<ArrayList<String>> marks = new ArrayList<ArrayList<String>>();
    	
    	//init
    	for (int i = 0; i < len + 1; i++)
    		marks.add(new ArrayList<String>());
    	
    	//
    	for (int i = 0; i < len; i++)
    	{
    		if (i != 0 && marks.get(i).isEmpty())
    			continue;
    		
    		for (String str : dict)
    		{
    			if (str.length() + i <= len && str.equals(s.substring(i, str.length() + i)))
    			{
    				int index = str.length() + i;
    				if (i == 0)
    				{
    					marks.get(index).add(str);
    				}
    				else
    				{
        				for (String bstr : marks.get(i))
        				{
        					marks.get(index).add(bstr + " " + str);
        				}
    					
    				}
    			}
    		}
    	}
    	
    	return marks.get(len);
    }	
}
