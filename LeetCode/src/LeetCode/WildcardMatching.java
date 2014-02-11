package LeetCode;

public class WildcardMatching {
	//Implement wildcard pattern matching with support for '?' and '*'.

	//'?' Matches any single character.
	//'*' Matches any sequence of characters (including the empty sequence).

	//The matching should cover the entire input string (not partial).

	//The function prototype should be:
	//bool isMatch(const char *s, const char *p)

	//Some examples:
	//isMatch("aa","a") -> false
	//isMatch("aa","aa") -> true
	//isMatch("aaa","aa") -> false
	//isMatch("aa", "*") -> true
	//isMatch("aa", "a*") -> true
	//isMatch("ab", "?*") -> true
	//isMatch("aab", "c*a*b") -> false
	
	//DB TLE
	public boolean isMatch(String s, String p) {
	    if (s == null || p == null)  return false;
	    
	    int lenp = p.length();
	    int lens = s.length();
	    boolean match[][] = new boolean[lenp+1][lens+1];
	    match[0][0] = true;
	    for (int i = 1; i <= lenp; i++)
	    	for (int j = 0; j <= lens; j++)
	    	{
	    		if (j > 0 && (p.charAt(i-1)== s.charAt(j-1) || p.charAt(i-1) == '?'))
	    			match[i][j] = match[i][j] || match[i-1][j-1];  
	    		if (p.charAt(i-1) == '*')
	    			match[i][j] = match[i][j] || match[i-1][j];
	    		if (j > 0 && p.charAt(i-1) == '*')
	    			match[i][j] = match[i][j] || match[i][j-1];
	    	}
	    return match[lenp][lens];
	}
}
