package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {

	@Test
	public void test() {
		RotateImage s = new RotateImage();
		int matrix[][] = new int[][]{{1,2},{3,4}}; 
		s.rotate(matrix);
		Assert.assertEquals(3, matrix[0][0]);
		Assert.assertEquals(1, matrix[0][1]);
		Assert.assertEquals(4, matrix[1][0]);
		Assert.assertEquals(2, matrix[1][1]);
		
	}

}
