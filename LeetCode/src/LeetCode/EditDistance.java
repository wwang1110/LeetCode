package LeetCode;

public class EditDistance {
	//Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. 
	//(each operation is counted as 1 step.)

	//You have the following 3 operations permitted on a word:

	//a) Insert a character
	//b) Delete a character
	//c) Replace a character
    public int minDistance(String word1, String word2) {
    	int len1 = word1.length();
    	int len2 = word2.length();
    	int step[][] = new int[len1+1][len2+1];
    	for (int i = 0; i <= len1; i++)
    		step[i][0] = i;
    	for (int i = 0; i <= len2; i++)
    		step[0][i] = i;
    	for (int i1 = 1; i1 <= len1; i1++)
    		for (int i2 = 1; i2 <= len2; i2++)
    		{
    			if (word1.charAt(i1 - 1) == word2.charAt(i2 - 1))
    				step[i1][i2] = step[i1-1][i2-1];
    			else
    				step[i1][i2] = Math.min(Math.min(step[i1-1][i2], step[i1][i2-1]), step[i1-1][i2-1]) + 1;
    		}
    	return step[len1][len2];
    }
}
