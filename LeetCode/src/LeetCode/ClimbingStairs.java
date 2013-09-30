package LeetCode;

public class ClimbingStairs {
	//You are climbing a stair case. It takes n steps to reach to the top.

	//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    public int climbStairs(int n) {
    	if (n == 0 || n == 1) return 1;
    	int s1 = 1;
    	int s2 = 1;
    	for (int i = 2; i <= n; i++)
    	{
        	int s3 = s1+s2;
    		s1 = s2;
    		s2 = s3;
    	}
    	return s2;
    }
}
