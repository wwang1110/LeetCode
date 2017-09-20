/* Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * 
 * Example 1:
 * 11110
 * 11010
 * 11000
 * 00000
 * Answer: 1
 * 
 * Example 2:
 * 11000
 * 11000
 * 00100
 * 00011
 * Answer: 3
 * 
 */

package lc.q0200.NumberofIslands;

public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++)
        	for (int j = 0; j < grid[0].length; j++)
        		if(grid[i][j] == '1')
        		{
        			fill(i, j, grid);
        			count++;
        		}
        return count;
    }

	private void fill(int i, int j, char[][] grid) {
		if (i < 0||i >= grid.length||j < 0|| j >= grid[0].length||grid[i][j] != '1')
			return;
		grid[i][j] = '2';
		fill(i-1,j,grid);
		fill(i+1,j,grid);
		fill(i,j-1,grid);
		fill(i,j+1,grid);
	}
}
