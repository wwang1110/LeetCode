/* Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 * Example 1:
 * Input:
 * s: "cbaebabacd" p: "abc"
 * Output:
 * [0, 6]
 * 
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * 
 * Example 2:
 * Input:
 * s: "abab" p: "ab"
 * Output:
 * [0, 1, 2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 * 
 */
package lc.q0438.FindAllAnagramsinString;

import java.util.*;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> res = new ArrayList<Integer>();
    	int m=s.length();
    	int n=p.length();
    	int[] ctb= new int[26];
    	for(char c: p.toCharArray())
    		ctb[c-'a']++;
    	
    	for(int i=0;i+n<=m;i++)
    	{
    		int[] tb= new int[26];
    		for(int j=0;j<n;j++)
    			tb[s.charAt(i+j)-'a']++;
    		boolean isAnagrams=true;
    		for(int k=0;k<26;k++)
    			if(tb[k]!=ctb[k])
    				isAnagrams=false;
    		if(isAnagrams)
    			res.add(i);
    	}
    	
    	return res;
    }
}
