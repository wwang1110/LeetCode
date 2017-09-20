/* Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.
 * 
 * Example 1:
 * Input:
 * "bbbab"
 * Output:
 * 4
 * One possible longest palindromic subsequence is "bbbb".
 * 
 * Example 2:
 * Input:
 * "cbbd"
 * Output:
 * 2
 * One possible longest palindromic subsequence is "bb".
 * 
 */
package lc.q0516.LongestPalindromicSubsequence;

public class Solution {
    public int longestPalindromeSubseq(String s) {
    	int len=s.length();
    	if(len<2)
    		return len;
    	String t=new StringBuilder(s).reverse().toString();
    	int[][] dp=new int[len+1][len+1];
    	for(int i=0;i<len;i++)
    		for(int j=0;j<len;j++)
    		{
    			if(s.charAt(i)==t.charAt(j))
    				dp[i+1][j+1]=dp[i][j]+1;
    			dp[i+1][j+1]=Math.max(dp[i+1][j+1], Math.max(dp[i][j+1], dp[i+1][j]));
    		}
    	return dp[len][len];
    }
}
