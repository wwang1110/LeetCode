package LeetCode;

public class IntegertoRoman {
	//Given an integer, convert it to a roman numeral.

	//Input is guaranteed to be within the range from 1 to 3999.
    public String intToRoman(int num) {
    	String ret = "";
    	int t = num / 1000;
    	num %= 1000;
    	for (int i = 0; i < t; i++)
    		ret += "M";

    	String roman = "MDCLXVI";

    	int i = 2;
    	int div = 100;
    	while (num > 0)
    	{
        	t = num / div;

        	if (t == 5)
        		ret += roman.charAt(i-1);
        	else if (t == 4)
        	{
	    		ret += roman.charAt(i);
        		ret += roman.charAt(i-1);
        	}
	    	else if (t==9)
	    	{
	    		ret += roman.charAt(i);
	    		ret += roman.charAt(i-2);
	    	}
	    	else
	    	{
	    		if (t > 5)
	    		{
	        		ret += roman.charAt(i-1);
	        		t %= 5;
	    		}
	        	for (int j = 0; j < t; j++)
	        		ret += roman.charAt(i);
	    	}
        	i += 2;
        	num = num % div;
        	div /= 10;
    	}	
    	return ret;
    }	
}
