package LeetCode;
public class PalindromePartitioningII {
	//Given a string s, partition s such that every substring of the partition is a palindrome.

	//Return the minimum cuts needed for a palindrome partitioning of s.

	//For example, given s = "aab",
	//Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.

    public int minCut(String s) {
    	if (s.isEmpty())
    		return 0;
    	if (isPalindrome(s, 0, s.length() - 1))
    	    return 0;
    	
    	int cuts[] = new int[s.length()];
    	
    	for (int i = 1; i < s.length(); i++)
    	{
    		cuts[i] = s.length();
    		for (int j = 0; j <= i; j++)
    		{
    			if (isPalindrome(s, j, i))
    			{
    				if (j == 0)
    					cuts[i] = 0;
    				else
    					cuts[i] = Math.min(cuts[i], cuts[j-1] + 1);
    			}
    		}
    	}
    	
    	return cuts[s.length() - 1];
    }	
    
    private boolean isPalindrome(String s, int start, int end){
    	while (start < end)
    		if (s.charAt(start++) != s.charAt(end--))
    			return false;
    	return true;
    }
}
