package LeetCode;

public class Pow {
    public double pow(double x, int n) {
    	int sign = 1;
    	if (n < 0)
    	{
    		sign = -1;
    		n = -n;
    	}
    	
    	double val = calcPow(x, n);
    	
    	if (sign == -1)
    		val = 1.0/val;
    	
    	return val;
    }
    private double calcPow(double x, int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	if (n == 0)
    		return 1;
    	
   		double val = pow(x, n/2);
   		val = val * val;
   		if (n % 2 == 1)
   			val *= x;
   		return val;
    }
}
