/**Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 * 
 */

package lc.q0008.StringtoInteger;

public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        
        if (str.length() == 0)
        	return 0;
        
        int idx = 0;
        
        int flag = 1;
        
        if (str.charAt(idx)=='-')
        {
        	flag = -1;
        	idx ++;
        }
        else if (str.charAt(idx)=='+')
        	idx ++;
        
        long x = 0;
        
        while (idx < str.length() && str.charAt(idx)>='0' && str.charAt(idx)<='9')
        {
        	x = x * 10 + (str.charAt(idx) - '0');
            
            if (flag * x > Integer.MAX_VALUE)
            	return Integer.MAX_VALUE;
            
            if (flag * x < Integer.MIN_VALUE)
        	    return Integer.MIN_VALUE;
            
        	idx ++;
        }
        
        return (int)(flag * x);
    }
}
