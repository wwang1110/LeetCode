/*	Reverse digits of an integer.
 * 	Example1: x = 123, return 321
 * 	Example2: x = -123, return -321
 * 	click to show spoilers.
 * 	Note:The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 * 
 */

package lc.q0007.ReverseInteger;

public class Solution {
    public int reverse(int x) {
    	
    	Boolean neg = false;
    	
    	if (x < 0)
    	{
    		neg = true;
    		x = -x;
    	}
    	
    	long newx = 0;
    	
    	while (x > 0)
    	{
    		newx = newx * 10 + x % 10;
    		x = x / 10;
    	}
    	
    	if (neg == true)
    		newx = -newx;
    	
    	if (newx > Integer.MAX_VALUE || newx < Integer.MIN_VALUE)
    		return 0;
    	
    	return (int)newx;
    }
}
