/* Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.
 * 
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 * 
 * Return true because "leetcode" can be segmented as "leet code".
 * 
 * UPDATE (2017/1/4):
 * The wordDict parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.


 * 
 */
package lc.q0139.WordBreak;

import java.util.*;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] table = new boolean[s.length()];
        
        for (int i = 0; i < s.length(); i++)
        {
        	if (i == 0 || i > 0 && table[i-1] == true)
        	{
        		for (int j = 0; j < wordDict.size(); j++)
        		{
        			String word = wordDict.get(j); 
        			int wlen = word.length(); 
        			if (i +  wlen <= s.length() && s.substring(i, i + wlen).equals(word))
        				table[i + wlen - 1] = true;
        		}
        	}
        }
        
        return table[s.length()-1];
    }
}
