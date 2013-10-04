package LeetCode;

public class EditDistance {
	//Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. 
	//(each operation is counted as 1 step.)

	//You have the following 3 operations permitted on a word:

	//a) Insert a character
	//b) Delete a character
	//c) Replace a character
    public int minDistance(String word1, String word2) {
    	int dis = 0;
    	if (word1.length() < word2.length())
    		dis += insertDis(word1, word2);
    	if (word1.length() > word2.length())
    		dis += deleteDis(word1, word2);
    	
    	return dis;
    }

	private int deleteDis(String word1, String word2) {
		return 0;
	}

	private int insertDis(String word1, String word2) {
		return 0;
	}
}
