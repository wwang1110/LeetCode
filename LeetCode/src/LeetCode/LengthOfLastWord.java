package LeetCode;

public class LengthOfLastWord {
	//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
	//return the length of last word in the string.

	//If the last word does not exist, return 0.

	//Note: A word is defined as a character sequence consists of non-space characters only.

	//For example, 
	//Given s = "Hello World",
	//return 5.
    public int lengthOfLastWord(String s) {
    	if (s == null)return 0;
    	s = s.trim();
    	int len = s.length();
    	if (len == 0)return 0;
    	
    	int i = len - 1;
    	while (i >=0 && s.charAt(i) != ' ')
    		i--;
    	
    	return len - i - 1;
    }
}
