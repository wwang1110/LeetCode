/* Given a word, you need to judge whether the usage of capitals in it is right or not.
 * 
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * Example 1:
 * Input: "USA"
 * Output: True
 * Example 2:
 * Input: "FlaG"
 * Output: False
 * 
 */

package lc.q0520.DetectCapital;

public class Solution {
    public boolean detectCapitalUse(String word) {
    	if(word.length()==0)
    		return false;
    	
    	boolean allCap=true;
    	for(char c:word.toCharArray())
    		if(!isCap(c))
    			allCap=false;
    	
    	if(allCap==true)
    		return true;

    	for(int i=1;i<word.length();i++)
    		if(isCap(word.charAt(i)))
    			return false;
    	return true;
    }
    private boolean isCap(char c)
    {
    	return c>='A'&&c<='Z';
    }
}
