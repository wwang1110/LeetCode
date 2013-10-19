package LeetCode;

public class ValidPalindrome {
	//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

	//For example,
	//"A man, a plan, a canal: Panama" is a palindrome.
	//"race a car" is not a palindrome.

	//Note:
	//Have you consider that the string might be empty? This is a good question to ask during an interview.

	//For the purpose of this problem, we define empty string as valid palindrome.
    public boolean isPalindrome(String s) {
    	if (s.isEmpty())
    		return true;
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < s.length(); i++)
    		if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9')
    			sb.append(s.charAt(i));
    		else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
    			sb.append((char)(s.charAt(i) - 'A' + 'a'));

    	if (sb.length() == 0)
    		return true;
    	
    	int i = 0; 
    	int j = sb.length() - 1;
    	while (i < j)
    		if (sb.charAt(i++) != sb.charAt(j--))
    			return false;
    	return true;
    }	
}
