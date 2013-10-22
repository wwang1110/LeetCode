package LeetCode;

public class DivideTwoIntegers {
	//Divide two integers without using multiplication, division and mod operator
    public int divide(int dividend, int divisor) {
    	int sign = 1;
    	if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)
    		sign = -1;
    	
    	long ldividend = Math.abs((long)dividend);
    	long ldivisor = Math.abs((long)divisor);

    	long ret = 0;
    	
    	long num = ldivisor;
    	long cnt = 1;
    	while (ldividend >= num)
    	{
    		num = num << 1;
    		cnt = cnt << 1;
    	}
    	
    	while(cnt > 0)
    	{
    		if (ldividend >= num)
    		{
    			ret += cnt;
    			ldividend -= num;
    		}
    		num = num >> 1;
    		cnt = cnt >> 1;
    	}
    	
    	if (sign == -1)
    		ret = -ret;
    	
    	return (int)ret;
    }
}
