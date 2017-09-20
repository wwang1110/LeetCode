//Implement pow(x, n).

package lc.q0050.PowXY;

public class Solution {
	
    public double myPow(double x, int n) {
    	boolean neg = false;
    	long num = n;
    	if (num < 0)
    	{
    		num = -num;
    		neg = true;
    	}
    	
    	double res = pow(x, num);
    	if(neg == true)
    		res = 1.0/res;
    	
    	return res;
    }

	private double pow(double x, long num) {
		if (num == 0)
			return 1;
		
		if (num == 1)
			return x;
		
		long reminder = num % 2;
		
		double res = pow(x, num / 2);
		
		res *= res;
		
		if (reminder == 1)
			res *= x;
		
		return res;
	}
}
