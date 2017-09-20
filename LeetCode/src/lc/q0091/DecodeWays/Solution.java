/* A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * 
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 * 
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * The number of ways decoding "12" is 2.
 * 
 */

package lc.q0091.DecodeWays;

public class Solution {
    public int numDecodings(String s) {
    	
    	if (s.length() == 0||s.charAt(0)=='0')
    		return 0;
    	
    	int[] ftb = new int[s.length()];

    	int i = 0;
    	while (i < s.length())
    	{
        	if (s.charAt(i) - '0' == 0)
        		ftb[i] = 0;
        	else
        	{
        		if (i - 1 >= 0)
        			ftb[i] = ftb[i-1];
        		else
        			ftb[i] = 1;
        	}
        	
        	if (i > 0 && s.charAt(i-1)!='0')
        	{
        		int c = (s.charAt(i-1)-'0') * 10 + (s.charAt(i) -'0');
        		if (0 < c && c <= 26)
        		{
        			if (i-2 >= 0)
        				ftb[i] += ftb[i-2];
                    else
                        ftb[i] += 1;
        		}
        	}
            i++;
    	}
    	
    	return ftb[s.length()-1];
    }
}
