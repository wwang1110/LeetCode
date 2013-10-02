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
    	return isInterleave(s1,0,s2,0,s3,0);
    }
    private boolean isInterleave(String s1, int i, String s2, int j, String s3, int k) {
    	if (i == s1.length() && j == s2.length() && k == s3.length())
    		return true;
    	boolean ret = false;
    	if (i < s1.length() && s1.charAt(i) == s3.charAt(k))
    		ret = ret || isInterleave(s1, i + 1, s2, j, s3, k + 1);
    	if (j < s2.length() && s2.charAt(j) == s3.charAt(k))
    		ret = ret || isInterleave(s1, i, s2, j + 1, s3, k + 1);
    	if (((i < s1.length() && s1.charAt(i) != s3.charAt(k))||i >= s1.length())
    		&& ((j < s2.length() && s2.charAt(j) != s3.charAt(k))||j >= s2.length()))
    		return false;
    	return ret;
    }
}
