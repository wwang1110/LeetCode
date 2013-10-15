package LeetCode;

public class DecodeWays {
	//A message containing letters from A-Z is being encoded to numbers using the following mapping:

	//'A' -> 1
	//'B' -> 2
	//...
	//'Z' -> 26
	//Given an encoded message containing digits, determine the total number of ways to decode it.

	//For example,
	//Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

	//The number of ways decoding "12" is 2.
    public int numDecodings(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	if (s.length() == 0 || s.charAt(0) == '0')
    		return 0;
    	if (s.length() == 1)
    		return 1;
    	int ways[] = new int[s.length()];
    	ways[0] = 1;

    	int num = Integer.parseInt(s.substring(0, 2));
    	int w = 0;
    	
		if (num <= 26 && s.charAt(0)!='0')
			w++;
		if (s.charAt(1) != '0')
			w++;
		if (w == 0)
			return 0;
		else
			ways[1] = w;
    	
    	for (int i = 2; i < ways.length; i++)
    	{
    		num = Integer.parseInt(s.substring(i - 1, i + 1));
    		w = 0;
    		if (num <= 26 && s.charAt(i-1)!='0')
    			w += ways[i - 2];
    		if (s.charAt(i) != '0')
    			w += ways[i - 1];
    		if (w == 0)
    			return 0;
    		else ways[i] += w;
    	}
    	return ways[ways.length - 1];
    }	
}
