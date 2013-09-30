package LeetCode;

public class TrappingRainWater {
	//Given n non-negative integers representing an elevation map where the width of each bar is 1, 
	//compute how much water it is able to trap after raining.

	//For example, 
	//Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.


	//The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 
	//6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

	private int maxLeft(int[] A, int idx)
	{
		int max = 0;
		for (int i = 0; i < idx; i++)
			max = Math.max(max, A[i]);
		return max;
	}
	private int maxRight(int[] A, int idx)
	{
		int max = 0;
		for (int i = idx + 1; i < A.length; i++)
			max = Math.max(max, A[i]);
		return max;
	}
	public int trap(int[] A) {
		int c = 0;
		for (int i = 0; i < A.length; i++)
		{
			int left = maxLeft(A, i);
			int right = maxRight(A, i);
			int min = Math.min(left, right);
			if (min > A[i]) c += min - A[i];
		}
		return c;
    }	
}
