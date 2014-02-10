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
	
	//dp
    public boolean isMatch(String s, String p) {
    	
    	int lens = s.length();
    	int lenp = p.length();
    	
    	boolean match[][] = new boolean[lenp + 1][lens + 1];
    	match[0][0] = true;
    	
    	for (int i = 1; i <= lenp; i++)
    		for (int j = 0; j <= lens; j++)
    		{
    			if (j == 0)
    			{
    				if (i > 1 && p.charAt(i-1)=='*')
						match[i][j] = match[i][j] || match[i-2][j];
    			}
    			else
    			{
    				if (p.charAt(i-1)=='.' || p.charAt(i-1) == s.charAt(j -1))
    					match[i][j] = match[i-1][j-1];
    				else if (i > 1 && p.charAt(i-1)=='*')
    				{
						match[i][j] = match[i][j] || match[i-2][j];
    					match[i][j] = match[i][j] || match[i-1][j];
    					if (match[i][j-1] == true && s.charAt(j-1) == p.charAt(i-2) || p.charAt(i-2) == '.')
        					match[i][j] = match[i][j] || match[i][j-1];
    				}
    			}
    		}
    	
    	return match[lenp][lens];
    }

    //recursive 
	//return isMatch(s,0,p,0);
    /*
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
    */
}
