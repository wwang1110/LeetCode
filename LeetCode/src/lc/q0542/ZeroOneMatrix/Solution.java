/* Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.
 * 
 * The distance between two adjacent cells is 1.
 * Example 1:
 * Input:
 * 0 0 0
 * 0 1 0
 * 0 0 0
 * Output:
 * 0 0 0
 * 0 1 0
 * 0 0 0
 * 
 * Example 2:
 * Input:
 * 0 0 0
 * 0 1 0
 * 1 1 1
 * Output:
 * 0 0 0
 * 0 1 0
 * 1 2 1
 * Note:
 * The number of elements of the given matrix will not exceed 10,000.
 * There are at least one 0 in the given matrix.
 * The cells are adjacent in only four directions: up, down, left and right.
 * 
 */

package lc.q0542.ZeroOneMatrix;

import java.util.*;

public class Solution {
	class Cell{
		public int i;
		public int j;
		public Cell(int I, int J)
		{
			i=I;
			j=J;
		}
	}
    public int[][] updateMatrix(int[][] matrix) {
    	if(matrix.length==0||matrix[0].length==0)
    		return matrix;
    	int m=matrix.length;
    	int n=matrix[0].length;
        boolean[][] masks=new boolean[m][n];
        Queue<Cell> que=new LinkedList<Cell>();
        for(int i=0;i<m;i++)
        	for(int j=0;j<n;j++)
        		if(matrix[i][j]==0)
        		{
        			masks[i][j]=true;
        			que.add(new Cell(i,j));
        		}
        while(!que.isEmpty())
        {
        	Cell cell=que.poll();
        	int i=cell.i;
        	int j=cell.j;
        	if(i-1>=0&&masks[i-1][j]==false)
        	{
        		masks[i-1][j]=true;
        		matrix[i-1][j]=matrix[i][j]+1;
        		que.add(new Cell(i-1,j));
        	}
        	if(i+1<m&&masks[i+1][j]==false)
        	{
        		masks[i+1][j]=true;
        		matrix[i+1][j]=matrix[i][j]+1;
        		que.add(new Cell(i+1,j));
        	}
        	if(j-1>=0&&masks[i][j-1]==false)
        	{
        		masks[i][j-1]=true;
        		matrix[i][j-1]=matrix[i][j]+1;
        		que.add(new Cell(i,j-1));
        	}
        	if(j+1<n&&masks[i][j+1]==false)
        	{
        		masks[i][j+1]=true;
        		matrix[i][j+1]=matrix[i][j]+1;
        		que.add(new Cell(i,j+1));
        	}
        }
        return matrix;
    }
}
