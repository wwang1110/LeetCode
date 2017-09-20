/* Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
 * 
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * Example:
 * 
 * matrix = [
 *    [ 1,  5,  9],
 *    [10, 11, 13],
 *    [12, 13, 15]
 *    ],
 * k = 8,
 * return 13.
 * Note: 
 * 
 */

package lc.q0378.KthSmallestElementinSortedMatrix;

import java.util.*;

public class Solution {
	class Cell
	{
		public int value;
		public int x;
		public int y;
		public Cell(int val, int nx, int ny)
		{
			value = val;
			x = nx;
			y = ny;
		}
	}
    public int kthSmallest(int[][] matrix, int k) {
    	int m = matrix.length;
    	int n = matrix[0].length;

    	PriorityQueue<Cell> queue = new PriorityQueue<Cell>((a,b)->a.value-b.value);
    	for(int i=0;i<m;i++)
    		queue.add(new Cell(matrix[i][0],0,i));
    	
    	Cell c = null; 
    	for(int i=0; i<k;i++)
    	{
    		c = queue.poll();
    		if(c.x+1<n)
    			queue.add(new Cell(matrix[c.y][c.x+1],c.x+1,c.y));
    	}
    	
    	return c.value;
    }
}
