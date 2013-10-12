package LeetCode;

public class SpiralMatrixII {
	//Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
	//For example,
	//Given n = 3,

	//You should return the following matrix:
	//[
	// [ 1, 2, 3 ],
	// [ 8, 9, 4 ],
	// [ 7, 6, 5 ]
	//]
	
    public int[][] generateMatrix(int n) {
    	int num[][] = new int[n][n];
    	if (n == 0)
    		return num;
    	
    	generate(num, 0, 0, 0, 1);
    	
    	return num;
    }

	private void generate(int[][] num, int i, int j, int direction, int step) {
    	//0 = left, 1 = down, 2 = right, 3 = up
		num[i][j] = step;
    	Point p = nextStep(i, j, direction);
    	if ( 0 <= p.x && p.x < num[0].length && 0 <= p.y && p.y < num.length && num[p.y][p.x] == 0)
    		generate(num, p.y, p.x, direction, step + 1);
    	else
    	{
    		direction = (direction + 1) % 4;
    		p = nextStep(i, j, direction);
    		if ( 0 <= p.x && p.x < num[0].length && 0 <= p.y && p.y < num.length && num[p.y][p.x] == 0)
    			generate(num, p.y, p.x, direction, step + 1);
    	}
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
}
