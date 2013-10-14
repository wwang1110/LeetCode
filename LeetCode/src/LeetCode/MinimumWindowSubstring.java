package LeetCode;

public class MinimumWindowSubstring {
	//Given a string S and a string T, find the minimum window in S which will contain all the characters 
	//in T in complexity O(n).

	//For example,
	//S = "ADOBECODEBANC"
	//T = "ABC"
	//Minimum window is "BANC".

	//Note:
	//If there is no such window in S that covers all characters in T, return the emtpy string "".

	//If there are multiple such windows, you are guaranteed that there will always be only one unique 
	//minimum window in S.
    public String minWindow(String S, String T) {
    	int marks[] = new int[26];
    	int start = 0;
    	int end = 0;
    	
    	for (int i = 0; i < S.length(); i++)
    	{
    		
    	}
    	return "";
    }	
}
