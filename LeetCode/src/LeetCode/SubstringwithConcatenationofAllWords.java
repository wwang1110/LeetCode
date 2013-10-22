package LeetCode;

import java.util.ArrayList;

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
    	ArrayList<Integer> ns = new ArrayList<Integer>();
    	int i = 0;
    	while (i < len)
    	{
    		boolean found = false;
    		if (i + wlen < len)
    		{
	    		for (int j = 0; j < L.length; j++)
	    			if (S.substring(i, i + wlen).equalsIgnoreCase(L[j]))
	    			{
	    				ns.add(j);
	    				found = true;
	    				break;
	    			}
    		}
    		if (found == true)
    			i += wlen;
    		else
    		{
    			ns.add(-1);
    			i ++;
    		}
    	}
    	
    	
    	int marks[] = new int [L.length];
    	int start = 0;
    	int minusOne = 0;
    	for (int k = 0; k < ns.size(); k++)
    	{
    		if (ns.get(k) != -1)
    		{
    			marks[ns.get(k)]++;
    			while (ns.get(k) > 1)
    				marks[ns.get(start++)]--;
    			
    			boolean completed = true;
    			for (int m : marks)
    				if (m == 0)
    					completed = false;
    			
    			if (completed == true)
    				ret.add((start - minusOne)*wlen + minusOne);
    		}
    		else
    		{
    			minusOne++;
    			for (int m = 0; m < marks.length; m++)
    				marks[m] = 0;
    			start = k + 1;
    		}
    	}
    	
        return ret;
    }
}
