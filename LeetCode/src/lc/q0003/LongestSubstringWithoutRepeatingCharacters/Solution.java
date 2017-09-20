/**Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * 	Given "abcabcbb", the answer is "abc", which the length is 3.
 * 	Given "bbbbb", the answer is "b", with the length of 1.
 * 	Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

package lc.q0003.LongestSubstringWithoutRepeatingCharacters;
import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	Map<Character, Boolean> map = new HashMap<Character, Boolean>();
    	int i = -1, j = -1;
    	int maxlen = 0;
    	while(j < s.length() - 1)
    	{
    		j++;
    		char c = s.charAt(j);
    		
			while(map.containsKey(c) && map.get(c) == true)
			{
				i++;
				map.put(s.charAt(i), false);
			}
    		
    		if (!map.containsKey(c) || map.get(c) == false)
    		{
    			map.put(c, true);
    			maxlen = Math.max(j-i, maxlen);
    		}
    	}
    	
    	return maxlen;
    }	  
    
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.lengthOfLongestSubstring("abcabcbb");
    }
}
