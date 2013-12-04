package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SubstringwithConcatenationofAllWords {
	//You are given a string, S, and a list of words, L, that are all of the same length. 
	//Find all starting indices of substring(s) in S that is a concatenation of each word in L 
	//exactly once and without any intervening characters.

	//For example, given:
	//S: "barfoothefoobarman"
	//L: ["foo", "bar"]

	//You should return the indices: [0,9].
	//(order does not matter).
    public ArrayList<Integer> findSubstring(String S, String[] L) {
    	ArrayList<Integer> ret = new ArrayList<Integer>();
    	int len = S.length();
    	int wlen = L[0].length();
    	int llen = wlen * L.length;
    	Arrays.sort(L);
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	for (String w : L)
    		if (map.containsKey(w))
    			map.put(w, map.get(w) + 1);
    		else
    			map.put(w, 1);
    	
    	for (int i = 0; i <= len - llen; i++)
    	{
        	Map<String, Integer> map2 = new HashMap<String, Integer>();
        	int start = i;
        	while (start < len && start - i < llen)
        	{
        		String str = S.substring(start, start + wlen);
        		boolean isValid = false;
        		if (map.containsKey(str))
        		{
        			if (!map2.containsKey(str))
        			{
        	    		map2.put(str, 1);
        	    		isValid = true;
        			}
        			else if (map2.containsKey(str) && map.get(str) > map2.get(str))
        			{
            			map2.put(str, map2.get(str) + 1);
            			isValid = true;
        			}
        		}
        		if (isValid)
        			start += wlen;
        		else
        			break;
        	}
    		if (start - i == llen)
    			ret.add(i);
    	}
    	
        return ret;
    }
}
