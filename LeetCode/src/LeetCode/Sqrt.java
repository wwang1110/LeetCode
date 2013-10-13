package LeetCode;

public class Sqrt {
	//Implement int sqrt(int x).

	//Compute and return the square root of x.
	
    public int sqrt(int x) {
    	if (x == 1)
    		return 1;
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	long num = x;
    	long start = 0;
    	long end = x;
    	while (start + 1 < end)
    	{
    		long mid = (start + end) / 2;
    		long mul = mid * mid;
    		if ( mul < num)
    			start = mid;
    		else if (mul > num)
    			end = mid;
    		else
    			return (int)mid;
    	}
    	
    	return (int)start;
    }	
}
