//Count the number of prime numbers less than a non-negative number, n.

package lc.q0204.CountPrimes;

public class Solution {
    public int countPrimes(int n) {
    	boolean[] tb = new boolean[n];
    	int count = 0;
    	for (int i = 2; i < n; i++)
    	{
    		if (tb[i] == false)
    		{
    			count++;
        		int j = 2;
        		while (i*j < n)
        		{
        			tb[i*j] = true;
        			j++;
        		}
    		}
    	}
    	return count;
    }
}
