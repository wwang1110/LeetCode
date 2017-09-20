/* Given a string s, partition s such that every substring of the partition is a palindrome.
 * 
 * Return all possible palindrome partitioning of s.
 * 
 * For example, given s = "aab",
 * 
 * Return
 *[
  ["aa","b"],
  ["a","a","b"]
 *]
 * 
 */
package lc.q0131.PalindromePartitioning;

import java.util.*;

public class Solution {
    public List<List<String>> partition(String s) {
    	List<List<String>> res = new ArrayList<List<String>>();
    	if (s.length() == 0)
    		return res;
    	
    	boolean[][] pt = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i ++)
        	for (int j = i; j < s.length();j++)
        	{
        		int x = i;
        		int y = j;
        		boolean isPal = true;
        		while(x < y)
        		{
        			if (s.charAt(x)!= s.charAt(y))
        			{
        				isPal = false;
        				break;
        			}
        			x++;
        			y--;
        		}
        		pt[i][j] = isPal;
        	}
        
        generatePals(0,new ArrayList<String>(), pt, s, res);
        
        return res;
    }

	private void generatePals(int i, ArrayList<String> l, boolean[][] pt, String s, List<List<String>> res) {
		
		if (i > s.length())
			return;
		
		if (i == s.length())
		{
			res.add(new ArrayList<String>(l));
			return;
		}
		
		for (int j = i; j < s.length(); j++)
		{
			if (pt[i][j] == true)
			{
				l.add(s.substring(i, j+1));
				generatePals(j+1, l, pt, s , res);
				l.remove(l.size()-1);
			}
		}
	}
}

