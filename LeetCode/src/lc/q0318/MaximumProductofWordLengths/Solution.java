/* Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.
 * 
 * Example 1:
 * Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
 * Return 16
 * The two words can be "abcw", "xtfn".
 * 
 * Example 2:
 * Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
 * Return 4
 * The two words can be "ab", "cd".
 * 
 * Example 3:
 * Given ["a", "aa", "aaa", "aaaa"]
 * Return 0
 * No such pair of words.
 * 
 */

package lc.q0318.MaximumProductofWordLengths;

public class Solution {
    public int maxProduct(String[] words) {
        int[] bitmap = new int[words.length];
        for (int i = 0; i < words.length; i++)
        	bitmap[i] = toBitmap(words[i]);
        
        int maxp = 0;
        for (int i=0; i<words.length;i++)
        	for (int j = i; j<words.length;j++)
        	{
        		if ((bitmap[i] & bitmap[j]) == 0)
        			maxp = Math.max(maxp, words[i].length()*words[j].length());
        	}
        return maxp;
    }

	private int toBitmap(String word) {
		int res = 0;
		for(char c: word.toCharArray())
		{
			int shift = c-'a';
			int bit = 1;
			while(shift>0)
			{
				bit=bit<<1;
				shift--;
			}
			res |= bit;
		}
		return res;
	}
}
