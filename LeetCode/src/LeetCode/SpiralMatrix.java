package LeetCode;

import java.util.ArrayList;

class Point {
	public int x;
	public int y;
}

public class SpiralMatrix {
	//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

	//For example,
	//Given the following matrix:

	//[
	//[ 1, 2, 3 ],
	//[ 4, 5, 6 ],
	//[ 7, 8, 9 ]
	//]
	//You should return [1,2,3,6,9,8,7,4,5].

	private int[][] marks = null;
	private ArrayList<Integer> ret = null;
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
    	ret = new ArrayList<Integer>();
    	if (matrix.length == 0 || matrix[0].length == 0)
    		return ret;
    	
    	int x = matrix.length;
    	int y = matrix[0].length;
    	marks = new int[x][y];
    	spiralWalk(matrix, 0, 0, 0);
    	return ret;
        
    }	
    private Point nextStep(int i, int j, int direction)
    {
    	Point p = new Point();
    	switch(direction)
    	{
    		//left
	    	case 0:
	    	{
	    		p.x = j + 1;
	    		p.y = i;
	    		break;
	    	}
	    	//down
	    	case 1:
	    	{
	    		p.x = j;
	    		p.y = i + 1;
	    		break;
	    	}
	    	//right
	    	case 2:
	    	{
	    		p.x = j - 1;
	    		p.y = i;
	    		break;
	    	}
	    	case 3:
	    	{
	    		p.x = j;
	    		p.y = i - 1;
	    		break;
	    	}
	    	default:
    	}
    	return p;
    }
    private void spiralWalk(int[][] matrix, int i, int j, int direction)
    {
    	//0 = left, 1 = down, 2 = right, 3 = up
    	ret.add(matrix[i][j]);
    	marks[i][j] = 1;

    	Point p = nextStep(i, j, direction);
    	if ( 0 <= p.x && p.x < matrix[0].length && 0 <= p.y && p.y < matrix.length && marks[p.y][p.x] == 0)
    		spiralWalk(matrix, p.y, p.x, direction);
    	else
    	{
    		direction = (direction + 1) % 4;
    		p = nextStep(i, j, direction);
    		if ( 0 <= p.x && p.x < matrix[0].length && 0 <= p.y && p.y < matrix.length && marks[p.y][p.x] == 0)
    			spiralWalk(matrix, p.y, p.x, direction);
    	}
    }
}
