package LeetCode;

public class RomantoInteger {
	//Given a roman numeral, convert it to an integer.

	//Input is guaranteed to be within the range from 1 to 3999.
    public int romanToInt(String s) {
    	String roman = "MDCLXVI";
    	int len = s.length();
    	int ret = 0;

    	int idx = 0;
    	while (idx < len && s.charAt(idx) == 'M')
    	{
    		ret += 1000;
    		idx++;
    	}
    	
    	int i = 2;
    	int div = 100;
    	
    	while (idx < len && i < 7)
    	{
	    	if (idx + 1 < len && s.charAt(idx) == roman.charAt(i) && s.charAt(idx+1) == roman.charAt(i-2))
	    	{
	    		ret += 9 * div;
	    		idx += 2;
	    	}
	    	else if (idx + 1 < len && s.charAt(idx) == roman.charAt(i) && s.charAt(idx+1) == roman.charAt(i-1))
	    	{
	    		ret += 4 * div;
	    		idx += 2;
	    	}
	    	else
	    	{
	    		if (idx < len && s.charAt(idx) == roman.charAt(i-1))
	    		{
	    			ret += 5 * div;
	    			idx++;
	    		}
	    		while (idx < len && s.charAt(idx) == roman.charAt(i))
	    		{
	    			ret += div;
	    			idx++;
	    		}
	    	}
	    	i += 2;
	    	div /= 10;
    	}
    	return ret;
    }
}
