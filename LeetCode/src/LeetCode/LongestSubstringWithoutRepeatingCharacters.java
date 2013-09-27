package LeetCode;

public class LongestSubstringWithoutRepeatingCharacters {
	//Given a string, find the length of the longest substring without repeating characters. 
	//For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
	//which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
    public int lengthOfLongestSubstring(String s) {
    	if (s == null || s.isEmpty())
    		return 0;
    	int len = s.length();
    	int markTable[] = new int[256];
    	int start =0, end = 1;
    	markTable[s.charAt(0)] = 1; 
    	int maxlen = 1;
    	while (end < len)
    	{
    		if (markTable[s.charAt(end)] == 0)
    		{
    			markTable[s.charAt(end)] += 1;
    			maxlen = Math.max(end - start + 1, maxlen);
    			end ++;
    		}
    		else
    		{
    			while (s.charAt(start) != s.charAt(end))
        			markTable[s.charAt(start++)] -= 1;
    			markTable[s.charAt(start++)] -= 1;
    		}
    	}
    	return maxlen;
    }
}
