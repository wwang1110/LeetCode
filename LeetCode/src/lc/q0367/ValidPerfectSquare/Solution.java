/* Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * 
 * Note: Do not use any built-in library function such as sqrt.
 * 
 * Example 1:
 * 
 * Input: 16
 * Returns: True
 * 
 * Example 2:
 * Input: 14
 * Returns: False
 * 
 */

package lc.q0367.ValidPerfectSquare;

public class Solution {
    public boolean isPerfectSquare(int num) {
    	long lo = 1;
    	long hi = num;
    	
    	while (lo < hi)
    	{
    		long m = (long)(lo + (hi-lo)/2);
    		long prod = m*m;
    		if (prod==num)
    			return true;
    		if (prod > num)
    			hi = m-1;
    		else
    			lo = m+1;
    	}
    	return lo * lo == num;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.isPerfectSquare(808201);
    }
}
