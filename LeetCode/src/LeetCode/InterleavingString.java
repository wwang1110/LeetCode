package LeetCode;

public class InterleavingString {
	//Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

	//For example,
	//Given:
	//s1 = "aabcc",
	//s2 = "dbbca",

	//When s3 = "aadbbcbcac", return true.
	//When s3 = "aadbbbaccc", return false.
	
    public boolean isInterleave(String s1, String s2, String s3) {
    	if (s1.length() + s2.length() != s3.length())
    		return false;
    	boolean table[][] = new boolean[s1.length() + 1][s2.length() + 1];
    	
    	for (int i = 0; i <= s1.length(); i++)
    		for (int j = 0; j <= s2.length(); j++)
    		{
    			if (i == 0 && j == 0) table[i][j] = true;
    			else if (i == 0 )
    			{
    				if (s2.charAt(j - 1) == s3.charAt(i + j - 1) && table[i][j - 1] == true) 
    					table[i][j] = true;
    			}
    			else if (j == 0)
    			{
    				if (s1.charAt(i - 1) == s3.charAt(i + j - 1) && table[i - 1][j] == true) 
    					table[i][j] = true;
    			}
    			else
    			{
    				if (s2.charAt(j - 1) == s3.charAt(i + j - 1) && table[i][j - 1] == true)
    					table[i][j] = true;
    				if (s1.charAt(i - 1) == s3.charAt(i + j - 1) && table[i - 1][j] == true) 
    					table[i][j] = true;
    			}
    				
    		}
    	return table[s1.length()][s2.length()];
    }
}
