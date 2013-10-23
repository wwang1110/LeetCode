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
    public boolean isMatch(String s, String p) {
    	while (p.contains("**"))
    		p = p.replace("**", "*");
    	
    	return isMatch(s, 0, p, 0);
    }
    private boolean isMatch(String s, int i1, String p, int i2) {
    	if (s.length() == i1 && p.length() == i2)
    		return true;
    	if (i2 < p.length())
    	{
    		if (i1 < s.length() && (s.charAt(i1) == p.charAt(i2) || p.charAt(i2) == '?'))
    			return isMatch(s, i1 + 1, p, i2 + 1);
    		if (i1 < s.length() && p.charAt(i2) == '*')
    		{
    			while (i1 < s.length())
    			{
	    			i1++;
	    			if (isMatch(s, i1, p, i2 + 1))
	    				return true;
    			}
    		}
    	}
    	return false;
    }
}
