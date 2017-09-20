/* Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.
 * 
 * Example 1:
 * Input:
 * s = "abpcplea", d = ["ale","apple","monkey","plea"]
 * Output:
 * "apple"
 * 
 * Example 2:
 * Input:
 * s = "abpcplea", d = ["a","b","c"]
 * Output:
 * "a"
 * Note:
 * 
 * All the strings in the input will only contain lower-case letters.
 * The size of the dictionary won't exceed 1,000.
 * The length of all the strings in the input won't exceed 1,000.
 * 
 */
package lc.q0524.LongestWordinDictionarythroughDeleting;

import java.util.*;

public class Solution {
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d, (a,b)->a.length()==b.length()?a.compareTo(b):b.length()-a.length());
        for(int i=0;i<d.size();i++)
        	if(isSubSeq(s, d.get(i)))
        		return d.get(i);
        return "";
    }

	private boolean isSubSeq(String s, String word) {
		int i=0;
		int j=0;
		while(j<word.length()&&i<s.length())
		{
			if(s.charAt(i)==word.charAt(j))
				j++;
			i++;
		}
		return j==word.length();
	}
}
