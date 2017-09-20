/* Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
 * 
 * Example:
 * Input:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * Output:  [1,2,4,7,5,3,6,8,9]
 * Explanation:
 * Note:
 * The total number of elements of the given matrix will not exceed 10,000.
 * 
 */
package lc.q0498.DiagonalTraverse;

public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
    	if(matrix.length==0||matrix[0].length==0)
    		return new int[0];
    	int m=matrix.length;
    	int n=matrix[0].length;
    	int[] res=new int[m*n];
    	int idx=0;
    	for(int i=0;i<m+n-1;i++)
    	{
    		if(i%2==0)
    		{
    			for(int j=i;j>=0;j--)
    				if(j<m&&i-j<n)
    					res[idx++]=matrix[j][i-j];
    		}
    		else
    		{
    			for(int j=0;j<=i;j++)
    				if(j<m&&i-j<n)
    					res[idx++]=matrix[j][i-j];
    		}
    	}
    	return res;
    }
}
