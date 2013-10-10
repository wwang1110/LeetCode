package LeetCode;

public class CountandSay {
	//The count-and-say sequence is the sequence of integers beginning as follows:
	//1, 11, 21, 1211, 111221, ...

	//1 is read off as "one 1" or 11.
	//11 is read off as "two 1s" or 21.
	//21 is read off as "one 2, then one 1" or 1211.
	//Given an integer n, generate the nth sequence.

	//Note: The sequence of integers will be represented as a string.
    public String countAndSay(int n) {
    	if (n <= 0)
    		return "";
    	return countAndSay("1", n - 1);
    }
    
    private String countAndSay(String s, int n) {
    	if (n == 0)
    		return s;
    	int len = s.length();
    	StringBuilder sb = new StringBuilder();
    	
    	int i = 0;
    	char c = s.charAt(0);
		int cnt = 0;
    	while (i < len)
    	{
    		if (i == len - 1 || i + 1 < len && s.charAt(i) != s.charAt(i+1))
    		{
    			cnt++;
    			sb.append(cnt);
    			sb.append(c);
    			if (i + 1 < len)
    			{
    				c = s.charAt(i+1);
    				cnt = 0;
    			}
    		}
    		else
    			cnt++;
    		i++;
    	}
    	return countAndSay(sb.toString(), n - 1);
    }
}
