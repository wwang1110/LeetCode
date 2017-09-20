/* Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 * 
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 * Example 2:
 * Input: 3
 * Output: False
 * 
 */
package lc.q0633.SumofSquareNumbers;

public class Solution {
    public boolean judgeSquareSum(int c) {
        int end=(int)Math.sqrt(c/2);
        for(int i=0;i<=end;i++)
        {
        	int j=(int)Math.sqrt(c-i*i);
        	if(j*j+i*i==c)
        		return true;
        }
        return false;
    }
}
