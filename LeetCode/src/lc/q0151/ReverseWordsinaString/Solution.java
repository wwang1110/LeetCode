/* Given an input string, reverse the string word by word.
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * 
 * Update (2015-02-12):
 * For C programmers: Try to solve it in-place in O(1) space.
 * 
 */

package lc.q0151.ReverseWordsinaString;

public class Solution {
    public String reverseWords(String s) {
    	String[] words = s.split(" ");
    	String res = "";
    	for (int i = words.length-1; i >= 0; i--)
    	{
    		if (!words[i].equals(""))
    			res += " " +  words[i];
    	}
    	return res.trim();
    }
}
