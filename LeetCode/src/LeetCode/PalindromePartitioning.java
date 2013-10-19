package LeetCode;

import java.util.ArrayList;

public class PalindromePartitioning {
	//Given a string s, partition s such that every substring of the partition is a palindrome.

	//Return all possible palindrome partitioning of s.

	//For example, given s = "aab",
	//Return

	// [
	//    ["aa","b"],
	//    ["a","a","b"]
	//  ]
	private ArrayList<ArrayList<String>> ret = null;
    public ArrayList<ArrayList<String>> partition(String s) {
    	ret = new ArrayList<ArrayList<String>>();
    	partition(s, 0, new ArrayList<String>());
    	return ret;
    }
    
    @SuppressWarnings("unchecked")
	private void partition(String s, int pos, ArrayList<String> cur){
    	if (pos == s.length())
    	{
    		ArrayList<String> partition = (ArrayList<String>)cur.clone();
    		ret.add(partition);
    		return;
    	}
    	for (int i = pos; i < s.length(); i++)
    		if (isPalindrome(s, pos, i)){
    			cur.add(s.substring(pos, i+1));
    			partition(s, i+1, cur);
    			cur.remove(cur.size() - 1);
    		}
    }
    
    private boolean isPalindrome(String s, int start, int end){
    	while (start < end)
    		if (s.charAt(start++) != s.charAt(end--))
    			return false;
    	return true;
    }
}
