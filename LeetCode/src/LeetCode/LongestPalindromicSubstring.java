package LeetCode;

public class LongestPalindromicSubstring {
	//Given a string S, find the longest palindromic substring in S. 
	//You may assume that the maximum length of S is 1000, and there exists one 
	//unique longest palindromic substring.
	
    public String longestPalindrome(String s) {
    	int len = s.length();
    	int maxlen = 0;
    	int idx = 0;
    	for (int i = 0; i < len ; i++)
    	{
    		int k = 0;
    		while (i - k >= 0 && i + k < len && s.charAt(i-k)==s.charAt(i+k))
    			k++;
    		if (maxlen < 1 + 2 * (k - 1))
    		{
    			maxlen = 1 + 2 * (k - 1);
    			idx = i - k + 1;
    		}
    		
    		if (i + 1 < len && s.charAt(i + 1) == s.charAt(i))
    		{
    			int j = 0; 
    			while (i - j >= 0 && i + 1 + j < len && s.charAt(i-j) == s.charAt(i+1+j))
    				j++;
        		if (maxlen < 2 + 2 * (j - 1))
        		{
        			maxlen = 2 + 2 * (j - 1);
        			idx = i - j + 1;
        		}
    		}
    	}
    	return s.substring(idx, idx + maxlen);
    }
}
