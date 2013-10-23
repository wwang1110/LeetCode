package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

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
    	int slen = wlen * L.length;
    	if (wlen < len)
    	{
    		for (int i = 0; i <= len - slen; i++)
    		{
    			ArrayList<String> dict = new ArrayList<String>();
    			Collections.addAll(dict, L);
    			
    			for (int j = i; j <= i + slen; j += wlen)
    			{
    				boolean found = false;
    				for (int k = 0; k < dict.size(); k++)
    					if (S.substring(j, j + wlen).equalsIgnoreCase(dict.get(k)))
    					{
    						found = true;
    						dict.remove(k);
    						break;
    					}
    				if (found == false)
    					break;
    			}
    			if (dict.isEmpty())
    				ret.add(i);
    		}
    	}
        return ret;
    }
}
