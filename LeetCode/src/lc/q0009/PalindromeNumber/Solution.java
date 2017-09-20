/* Determine whether an integer is a palindrome. Do this without extra space.
 */

package lc.q0009.PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        
    	if (x < 0)
    		return false;
    	
    	if (x < 10)
        	return true;
        
    	long d1 = 1;
    	while (d1 * 10 <= x)
        	d1 *= 10;
        
    	long d2 = 1;
    	
        while (d1 > d2)
        {
        	long l = (x % (d1 * 10))/d1;
        	long r = (x % (d2 * 10))/d2;
        	if (l != r)
        		return false;
        	d1 /= 10;
        	d2 *= 10;
        }
        
        return true;
    }
    
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.isPalindrome(-2147447412);
    }    
}
