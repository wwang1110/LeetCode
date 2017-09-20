/* Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 * 
 */
package lc.q0069.SqrtX;

public class Solution {
    public int mySqrt(int x) {
    	int l = 0; 
    	int r = x;
    	
    	while (l < r)
    	{
    		int m = (l + r) / 2;
    		 
    		if ((long)(m+1) * (long)(m+1) <= x)
    			l = m + 1;
    		else if ((long)m * (long)m > x)
    			r = m;
    		else
    			return m;
    	}
    	return l;
    }
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.mySqrt(2147395599);
    }        
}
