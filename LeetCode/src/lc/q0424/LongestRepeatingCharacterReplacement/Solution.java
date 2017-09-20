/* Given a string that consists of only uppercase English letters, you can replace any letter in the string with another letter at most k times. Find the length of a longest substring containing all repeating letters you can get after performing the above operations.
 * 
 * Note:
 * Both the string's length and k will not exceed 104.
 * Example 1:
 * Input:
 * s = "ABAB", k = 2
 * Output:
 * 4
 * Explanation:
 * Replace the two 'A's with two 'B's or vice versa.
 * 
 * Example 2:
 * Input:
 * s = "AABABBA", k = 1
 * Output:
 * 4
 * Explanation:
 * Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 * 
 */

package lc.q0424.LongestRepeatingCharacterReplacement;

public class Solution {
    public int characterReplacement(String s, int k) {
    	int[] ctb=new int[26];
    	int maxcount=0;
    	int ret=0;
        for(int i=0,j=0;i<s.length();i++)
        {
        	ctb[s.charAt(i)-'A']++;
        	maxcount=Math.max(maxcount, ctb[s.charAt(i)-'A']);
        	while(i-j+1-maxcount>k)
        	{
            	ctb[s.charAt(j)-'A']--;
        		j++;
        		for(int m=0;m<26;m++)
                	maxcount=Math.max(maxcount, ctb[m]);
        	}
        	ret=Math.max(ret, i-j+1-maxcount);
        }
        return ret;
    }
}
