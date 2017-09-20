/* Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT.
 */

package lc.q0029.DivideTwoIntegers;

public class Solution {
    public int divide(int dividend, int divisor) {
    	
    	boolean neg = false;
    	
    	long ldividend = dividend;
    	if (ldividend < 0)
    	{
    		neg = !neg;
    		ldividend = -ldividend;
    	}
    	
    	long ldivisor = divisor;
    	if (ldivisor < 0)
    	{
    		neg = !neg;
    		ldivisor = -ldivisor;
    	}
    	
    	if (ldivisor == 0)
    		return Integer.MAX_VALUE;
    	
    	long x = 1;
    	long d = ldivisor;
    	long res = 0;
    	
    	while (ldividend >= d << 1)
    	{
    		x = x << 1;
    		d = d << 1;
    	}
    	
    	while (ldividend >= ldivisor)
    	{
    		if (ldividend >= d)
    		{
	    		ldividend -= d;
	    		res += x;
    		}
    		d = d >> 1;
    		x = x >> 1;
    	}
    	
    	if (neg == true)
    		res = -res;
    	
    	if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
    		return Integer.MAX_VALUE;
    	
    	return (int)res;
    }
    
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.divide(-2147483648, -1);
    }       
}
