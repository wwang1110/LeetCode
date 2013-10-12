package LeetCode;

import java.util.Arrays;

public class PermutationSequence {
	//The set [1,2,3,…,n] contains a total of n! unique permutations.

	//By listing and labeling all of the permutations in order,
	//We get the following sequence (ie, for n = 3):

	//"123"
	//"132"
	//"213"
	//"231"
	//"312"
	//"321"
	//Given n and k, return the kth permutation sequence.

	//Note: Given n will be between 1 and 9 inclusive.
    public String getPermutation(int n, int k) {
    	if (n == 1)
    		return "1";
    	
    	char num[] = new char[n];
    	for (int i = 0; i < n; i++)
    		num[i] = (char)(i + '1');
    	
    	int total = 1;
    	for (int i = 1; i <= n; i++)
    		total *= i;
    	k %= (total + 1);
    	
    	while (--k > 0)
    		nextPerm(num);
    	
    	return new String(num); 
    }

    public void nextPerm(char[] num) {
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
    	
    	char tmp = num[i-1];
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
