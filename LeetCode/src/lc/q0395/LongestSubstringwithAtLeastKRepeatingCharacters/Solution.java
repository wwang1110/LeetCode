/* Find the length of the longest substring T of a given string (consists of lowercase letters only) such that every character in T appears no less than k times.
 * 
 * Example 1:
 * Input:
 * s = "aaabb", k = 3
 * Output:
 * 3
 * 
 * The longest substring is "aaa", as 'a' is repeated 3 times.
 * Example 2:
 * Input:
 * 
 * s = "ababbc", k = 2
 * Output:
 * 5
 * 
 * The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 * 
 */

package lc.q0395.LongestSubstringwithAtLeastKRepeatingCharacters;

public class Solution {
    public int longestSubstring(String s, int k) {
        if(k>s.length())
        	return 0;
        int[] ctb = new int[26];
        for(int i=0;i<s.length();i++)
        	ctb[s.charAt(i)-'a']++;
        int idx=0;
        while(idx<s.length()&&ctb[s.charAt(idx)-'a']>=k)
        	idx++;
        if(idx==s.length())
        	return s.length();
        int left = longestSubstring(s.substring(0,idx),k);
        int right = longestSubstring(s.substring(idx+1),k);
        return Math.max(left, right);
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.longestSubstring("aaabb",3);
    } 
}
