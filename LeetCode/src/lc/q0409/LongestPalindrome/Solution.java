/* Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * 
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * 
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * 
 * Example:
 * Input:
 * "abccccdd"
 * Output:
 * 7
 * 
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 */
package lc.q0409.LongestPalindrome;

import java.util.*;

public class Solution {
    public int longestPalindrome(String s) {
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	for(int i=0;i<s.length();i++)
    	{
    		char c = s.charAt(i);
    		if(!map.containsKey(c))
        		map.put(c, 1);
    		else
    			map.put(c, map.get(c)+1);
    	}
    	
    	boolean extra=false;
    	int total =0;
    	for(char c: map.keySet())
    	{
    		int count = map.get(c);
    		if((count&1)==1)
    			extra=true;
    		total += count/2;
    	}
    	return total * 2 + (extra?1:0);
    }
}
