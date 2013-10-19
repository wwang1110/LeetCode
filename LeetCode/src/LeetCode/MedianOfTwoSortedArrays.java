package LeetCode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int A[], int B[]) {
    	if (A.length > B.length)
    		return findMedianSortedArrays(B, A);
    	
    	int i1 = 0, i2 = A.length - 1;
    	int j1 = 0, j2 = B.length - 1;
    	
    	int len = i2 - i1 + 1; 
    	while (len > 2)
    	{
    		int i3 = (i2 + i1) / 2;
    		int j3 = (j2 + j1) / 2;
    		int cut = i3 - i1;
    		
    		if (A[i3] <= B[j3])
    		{
    			i1 = i1 + cut;
    			j2 = j2 - cut;
    		}
    		else
    		{
    			i2 = i2 - cut;
    			j1 = j1 + cut;
    		}
    		len = i2 - i1 + 1;
    	}

    	len = i2 - i1 + 1;
    	if (len == 2)
    	{
			int mid = (j1 + j2) / 2;
    		if ((j2 - j1 + 1) % 2 == 0)
    		{
    			if (A[i1] <= B[mid] && B[mid + 1] <= A[i2])
    				return (B[mid] + B[mid + 1]) / 2.0;
    			if (B[mid] <= A[i1] && A[i2] <= B[mid + 1])
    				return (A[i1] + A[i2]) / 2.0;
    			
    			if (A[i1] <= B[mid])
    				i1++;
    			else
    				j1++;
    			
    			if (A[i2] >= B[mid + 1])
    				i2--;
    			else
    				j2--;
    		}
    		else
    		{
    			if (A[i1] <= B[mid] && B[mid] <= A[i2])
    				return B[mid];
    			else if (A[i1] <= B[mid])
    			{
    				i1++;
    				j2--;
    			}
    			else
    			{
    				i2--;
    				j1++;
    			}
    		}
    	}
    	
    	len = i2 - i1 + 1;
    	if (len == 1)
    	{
    		if (j2 - j1 + 1 == 1)
    			return (A[i1] + B[j1]) / 2.0;
    		
    		int mid = (j1 + j2) / 2;
    		if ((j2 - j1 + 1) % 2 == 0)
    		{
    			if (A[i1] <= B[mid])
    			{
    				i1++;
    				j2--;
    			}
    			else if (A[i1] >= B[mid + 1])
    			{
    				j1++;
    				i2--;
    			}
    			else
    				return A[i1];
    		}
    		else
    		{
    			if (A[i1] <= B[mid - 1])
    			{
    				i1++;
    				j2--;
    			}
    			else if (A[i1] >= B[mid + 1])
    			{
    				j1++;
    				i2--;
    			}
    			else
    				return (A[i1] + B[mid]) / 2.0;
    		}
    	}
    	
    	return findMedian(B, j1, j2);
    }
    
	private double findMedian(int A[], int i, int j){
		int len = j - i + 1;
    	if (len % 2 == 0)
    		return (A[(j + i)/2] + A[(j + i)/2 + 1]) / 2.0;
   		return A[(j + i)/2];
    }
   
}
