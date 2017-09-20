/* Write a program to check whether a given number is an ugly number.
 * 
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * 
 * Note that 1 is typically treated as an ugly number.
 * 
 */
package lc.q0263.UglyNumber;

public class Solution {
    public boolean isUgly(int num) {
    	if (num == 0)
    		return false;
        int[] primes = new int[] {2, 3, 5};
        for (int i = 0; i < primes.length; i++)
        	while (num % primes[i] == 0)
        		num /= primes[i];
        return num == 1;
    }
}
