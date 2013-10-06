package LeetCode;

public class Candy {
	//There are N children standing in a line. Each child is assigned a rating value.

	//You are giving candies to these children subjected to the following requirements:

	//Each child must have at least one candy.
	//Children with a higher rating get more candies than their neighbors.
	//What is the minimum candies you must give?
    public int candy(int[] ratings) {
    	if (ratings.length < 2)
    		return ratings.length;
    	int tbl[] = new int[ratings.length];
    	if (ratings[0] < ratings[1]) tbl[0] = 1;
    	if (ratings[ratings.length - 1] < ratings[ratings.length - 2]) tbl[ratings.length - 1] = 1;
    	for (int i = 1; i < ratings.length - 1; i++)
    		if (ratings[i] < ratings[i - 1] && ratings[i] < ratings[i+1])
    			tbl[i] = 1;
    	
    	for (int i = 0; i < ratings.length; i++)
    		for (int j = 0; j < ratings.length; j++)
    		{
    			if (i-1 >= 0 && tbl[i-1] > tbl[i] && ratings[i-1] < ratings[i])
    				tbl[i] = tbl[i-1] + 1;
    			if (i+1 < ratings.length && tbl[i+1] > tbl[i] && ratings[i+1] < ratings[i])
    				tbl[i] = tbl[i+1] + 1;
    		}
    	
    	int sum = 0;
    	for (int c : tbl)
    		sum += c;
    	return sum;
    }
}
