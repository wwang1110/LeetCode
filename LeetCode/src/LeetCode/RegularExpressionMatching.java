package LeetCode;

public class RegularExpressionMatching {
	//Implement regular expression matching with support for '.' and '*'.

	//'.' Matches any single character.
	//'*' Matches zero or more of the preceding element.

	//The matching should cover the entire input string (not partial).

	//The function prototype should be:
	//bool isMatch(const char *s, const char *p)

	//Some examples:
	//isMatch("aa","a")  false
	//isMatch("aa","aa")  true
	//isMatch("aaa","aa")  false
	//isMatch("aa", "a*")  true
	//isMatch("aa", ".*")  true
	//isMatch("ab", ".*")  true
	//isMatch("aab", "c*a*b")  true
    public boolean isMatch(String s, String p) {
    	return isMatch(s,0,p,0);
    }

    private boolean isMatch(String s, int i, String p, int j) {
    	if (j == p.length() && i == s.length())
    		return true;
    	
		if (j + 1 < p.length() && p.charAt(j + 1)=='*')
		{
			while (i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'))
			{
				if(isMatch(s, i, p, j + 2))
					return true;
				i++;
			}
			return isMatch(s, i, p, j + 2);
    	}
		else
		{
			if (i < s.length() && j < p.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'))
				return isMatch(s, i + 1, p, j + 1);
		}
		
		return false;
    }
}
