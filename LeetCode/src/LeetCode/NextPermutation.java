package LeetCode;

import java.util.Arrays;

public class NextPermutation {
	//Implement next permutation, which rearranges numbers into the lexicographically next greater 
	//permutation of numbers.

	//If such arrangement is not possible, it must rearrange it as the lowest possible order 
	//(ie, sorted in ascending order).

	//The replacement must be in-place, do not allocate extra memory.

	//Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in 
	//the right-hand column.
	//1,2,3  1,3,2
	//3,2,1  1,2,3
	//1,1,5  1,5,1
    public void nextPermutation(int[] num) {
    	int i = num.length - 1;
    	while (i > 0 && num[i-1] >= num[i])
    		i--;
    	
    	if (i == 0)
    	{
    		Arrays.sort(num);
    		return;
    	}
    	
    	int j = num.length - 1;
    	while (num[j] <= num[i-1])
    		j--;
    	
    	int tmp = num[i-1];
    	num[i-1] = num[j];
    	num[j] = tmp;
    	
    	j = num.length -1;
    	while (i < j)
    	{
        	tmp = num[i];
        	num[i] = num[j];
        	num[j] = tmp;
        	i++;
        	j--;
    	}
    }
}
