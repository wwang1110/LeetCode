/* Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 * 
 * For example,
 * 
 * Given "egg", "add", return true.
 * 
 * Given "foo", "bar", return false.
 * 
 * Given "paper", "title", return true.
 * 
 * Note:
 * 
 * You may assume both s and t have the same length.
 * 
 */

package lc.q0205.IsomorphicStrings;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] s2t = new char[256];
        char[] t2s = new char[256];
        
        for (int i = 0;i < s.length(); i++)
        {
        	if (s2t[s.charAt(i)] =='\u0000' && t2s[t.charAt(i)] == '\u0000')
        	{
        		s2t[s.charAt(i)] = t.charAt(i);
        		t2s[t.charAt(i)] = s.charAt(i);
        	}
        	else if (s2t[s.charAt(i)] == t.charAt(i) && t2s[t.charAt(i)] == s.charAt(i))
        		continue;
        	else
        		return false;
        }
        
        return true;
    }
}
