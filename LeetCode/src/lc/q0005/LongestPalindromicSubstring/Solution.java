/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * Example:
 * 		Input: "babad"
 * 		Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example:
 * 		Input: "cbbd"
 * 		Output: "bb"
 */
package lc.q0005.LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
    	String str = ""; 
        for (int i = 0; i < s.length(); i++)
        {
        	//case 1
        	int m1 = i;
        	int m2 = i;
        	while ( m1 >= 0 && m2 < s.length() && s.charAt(m1)==s.charAt(m2))
        	{
        		if (m2 - m1 + 1 > str.length())
        			str = s.substring(m1, m2 + 1);
        		m1--;
        		m2++;
        	}
        	
        	//case 2
        	m1 = i;
        	m2 = i + 1;
        	while ( m1 >= 0 && m2 < s.length() && s.charAt(m1)==s.charAt(m2))
        	{
        		if (m2 - m1 + 1 > str.length())
        			str = s.substring(m1, m2 + 1);
        		m1--;
        		m2++;
        	}
        }
        
        return str;
    }
    
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.longestPalindrome("babad");
    }    
}
