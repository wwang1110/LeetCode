package LeetCode;

public class DivideTwoIntegers {
	//Divide two integers without using multiplication, division and mod operator
    public int divide(int dividend, int divisor) {
    	int sign = 1;
    	if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)
    		sign = -1;
    	
    	if (dividend < 0)
    		dividend = -dividend;

    	if (divisor < 0)
    		divisor = -divisor;
    	
    	int ret = 0;
    	
    	while (dividend >= divisor)
    	{
    		dividend -= divisor;
    		ret++;
    	}
    	if (sign == -1)
    		ret = -ret;
    	
    	return ret;
    }
}
