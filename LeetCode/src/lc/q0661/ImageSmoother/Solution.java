/*
Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.

Example 1:
Input:
[[1,1,1],
 [1,0,1],
 [1,1,1]]
Output:
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
Explanation:
For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
For the point (1,1): floor(8/9) = floor(0.88888889) = 0
Note:
The value in the given matrix is in the range of [0, 255].
The length and width of the given matrix are in the range of [1, 150].
*/
package lc.q0661.ImageSmoother;

public class Solution {
    public int[][] imageSmoother(int[][] M) {
    	if(M.length==0||M[0].length==0)
    		return M;
    	
        int[][] ret= new int[M.length][M[0].length];
        for(int i=0;i<M.length;i++)
        	for(int j=0;j<M[0].length;j++)
        	{
        		ret[i][j]=getGrayScale(i,j,M); 
        	}
        return ret;
    }

	private int getGrayScale(int i, int j, int[][] m) {
		int count=1;
		int sum=m[i][j];
		if(i>0&&j>0)
		{
			count++;
			sum+=m[i-1][j-1];
		}
		if(i>0)
		{
			count++;
			sum+=m[i-1][j];
		}
		if(i>0&&j+1<m[0].length)
		{
			count++;
			sum+=m[i-1][j+1];
		}
		if(j>0)
		{
			count++;
			sum+=m[i][j-1];
		}
		if(j+1<m[0].length)
		{
			count++;
			sum+=m[i][j+1];
		}
		if(i+1<m.length&&j>0)
		{
			count++;
			sum+=m[i+1][j-1];
		}
		if(i+1<m.length)
		{
			count++;
			sum+=m[i+1][j];
		}
		if(i+1<m.length&&j+1<m[0].length)
		{
			count++;
			sum+=m[i+1][j+1];
		}
		return sum/count;
	}
}
