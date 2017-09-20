/* Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.
 * 
 * To make problem a bit easier, all A, B, C, D have same length of N where 0 <= N <= 500. All integers are in the range of -228 to 228 - 1 and the result is guaranteed to be at most 231 - 1.
 * 
 * Example:
 * Input:
 * A = [ 1, 2]
 * B = [-2,-1]
 * C = [-1, 2]
 * D = [ 0, 2]
 * 
 * Output:
 * 2
 * 
 * Explanation:
 * The two tuples are:
 * 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
 * 
 */

package lc.q0454.FourSumII;

import java.util.*;

public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	Map<Long, Integer> map = new HashMap<Long, Integer>();
    	
    	for(int i=0; i<A.length;i++)
    		for(int j=0;j<B.length;j++)
    		{
    			long sum=A[i]+B[j];
    			if(!map.containsKey(sum))
    				map.put(sum, 1);
    			else
    				map.put(sum, map.get(sum)+1);
    		}
    	
    	int count=0;
    	for(int i=0;i<C.length;i++)
    		for(int j=0;j<D.length;j++)
    		{
    			long sum=-(C[i]+D[j]);
    			if(map.containsKey(sum))
    				count+=map.get(sum);
    		}
    	
    	return count;
    }
}
