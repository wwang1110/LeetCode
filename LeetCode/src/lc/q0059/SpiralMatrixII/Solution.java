/* Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * For example,
 * Given n = 3,
 * You should return the following matrix:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */

package lc.q0059.SpiralMatrixII;

public class Solution {
    public int[][] generateMatrix(int n) {
        int l = 0;
        int r = n - 1;
        int t = 0;
        int b = n - 1;
        
        int[][] res = new int[n][n];
        
        int num = 0;
        
        while(l < r)
        {
	        for (int i = l; i < r; i++)
	        	res[t][i] = ++num;
	        
	        for (int j = t; j < b; j++)
	        	res[j][r] = ++num;
	        
	        for (int i = r; i > l; i--)
	        	res[b][i] = ++num;
	        
	        for (int j = b; j > t; j--)
	        	res[j][l] = ++num;
	        
	        l++;
	        r--;
	        t++;
	        b--;
        }
        
        if (l == r)
        	res[l][l] = ++num;
        
        return res;
    }
}
