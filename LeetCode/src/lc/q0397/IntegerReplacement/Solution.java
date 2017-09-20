/* Given a positive integer n and you can do operations as follow:
 * 
 * If n is even, replace n with n/2.
 * If n is odd, you can replace n with either n + 1 or n - 1.
 * What is the minimum number of replacements needed for n to become 1?
 * 
 * Example 1:
 * Input:
 * 8
 * Output:
 * 3
 * Explanation:
 * 8 -> 4 -> 2 -> 1
 * 
 * Example 2:
 * Input:
 * 7
 * Output:
 * 4
 * Explanation:
 * 7 -> 8 -> 4 -> 2 -> 1
 * or
 * 7 -> 6 -> 3 -> 2 -> 1
 * 
 */

package lc.q0397.IntegerReplacement;

import java.util.*;

public class Solution {
	class Step{
		public long value;
		public int distance;
		public Step(long val, int dis)
		{
			value=val;
			distance=dis;
		}
	}
    public int integerReplacement(int n) {
        Queue<Step> queue = new LinkedList<Step>();
        
        queue.add(new Step(n, 0));
        
        while(!queue.isEmpty())
        {
        	Step stp = queue.poll();
        	if(stp.value==1)
        		return stp.distance;
        	if(stp.value%2==0)
        		queue.add(new Step(stp.value/2, stp.distance+1));
        	else
        	{
      			queue.add(new Step(stp.value+1, stp.distance+1));
        		queue.add(new Step(stp.value-1, stp.distance+1));
        	}
        }
        return -1;
    }
}
