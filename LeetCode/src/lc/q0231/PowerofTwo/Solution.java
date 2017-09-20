//Given an integer, write a function to determine if it is a power of two.

package lc.q0231.PowerofTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
    	if (n < 0)
    		return false;
    	
    	int count = 0;
    	while (n > 0)
    	{
    		count += n & 1;
    		n = n >> 1;
    	}
    	
    	return count == 1;
    }
}
