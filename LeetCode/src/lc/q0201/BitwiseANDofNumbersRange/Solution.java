/* Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 * 
 * For example, given the range [5, 7], you should return 4.
 * 
 */
package lc.q0201.BitwiseANDofNumbersRange;

public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if (m <= n/2)
            return 0;
        if (m == n)
            return m;
        
    	int o = n;
    	while(m < n && m != Integer.MAX_VALUE)
        {
    		o &= m;
            m++;
        }
    	
    	return o;
    }
}
