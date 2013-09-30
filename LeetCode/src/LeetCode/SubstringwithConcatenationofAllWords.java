package LeetCode;

import java.util.ArrayList;
import java.util.List;

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
        // Start typing your Java solution below
        // DO NOT write main() function
    	ArrayList<Integer> ret = new ArrayList<Integer>();
    	int wordlen = L[0].length();
    	int fulllen = wordlen * L.length;
    	
    	List<String> words = new ArrayList<String>();
    	for (String w : L)
    		words.add(w);
    	
        for (int i = 0; i < S.length() - fulllen; i++)
        {
        	if (matchSubstring(S, i, words, wordlen) == true)
        		ret.add(i);
        }
        return ret;
    }
    private boolean matchSubstring(String S, int idx, List<String> words, int wordlen) {
    	if (words.size() == 0)
    		return true;
    	if (idx + wordlen < S.length())
    	{
    		String word = S.substring(idx, idx + wordlen);
    		for (String w : words)
    		{
    			if (w.equals(word))
    			{
    				words.remove(w);
    				boolean find = matchSubstring(S, idx + wordlen, words, wordlen);
    				words.add(w);
    				return find;
    			}
    		}
    	}
    	return false;
    }
}
