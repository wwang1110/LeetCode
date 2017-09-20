/* Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
 * 
 * Example 1:
 * Input:s1 = "ab" s2 = "eidbaooo"
 * Output:True
 * Explanation: s2 contains one permutation of s1 ("ba").
 * 
 * Example 2:
 * Input:s1= "ab" s2 = "eidboaoo"
 * Output: False
 * Note:
 * The input strings only contain lower case letters.
 * The length of both given strings is in range [1, 10,000].
 * 
 */
package lc.q0567.PermutationinString;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
    	int[] arr1=new int[26];
    	for(char c: s1.toCharArray())
    		arr1[c-'a']++;
    	
    	int len=s1.length();
    	int[] arr2=new int[26];
    	for(int j=0;j<len&&j<s2.length();j++)
    		arr2[s2.charAt(j)-'a']++;
    	
    	int k=0;
    	while(k+len<=s2.length())
    	{
    		boolean isPerm=true;
    		for(int i=0;i<26;i++)
    			if(arr1[i]!=arr2[i])
    				isPerm=false;
    		if(isPerm==true)
    			return true;
    		if(k+len<s2.length())
    		{
    			arr2[s2.charAt(k)-'a']--;
    			arr2[s2.charAt(k+len)-'a']++;
    		}
    		k++;
    	}
    	return false;
    }
}
