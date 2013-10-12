package LeetCode;

public class ValidNumber {
	//Validate if a given string is numeric.

	//Some examples:
	//"0" => true
	//" 0.1 " => true
	//"abc" => false
	//"1 a" => false
	//"2e10" => true
	//Note: It is intended for the problem statement to be ambiguous. You should 
	//gather all requirements up front before implementing one.
    public boolean isNumber(String s) {
    	s = s.trim();
    	if (s == null || s.length() == 0)
    		return false;

    	String s1[] = s.split("e");
    	if (s1.length > 2 || s1.length == 0)
    		return false;
    	
    	for (String str : s1)
    		if (isValid(str) == false)
    			return false;
    	
    	return true;
    }

	private boolean isValid(String str) {
		if (str.length() == 0)
			return false;
		
    	if (str.charAt(0) == '-' || str.charAt(0) == '+')
    		str = str.substring(1);
    	
    	String s2[] = str.split("\\.");
    	if (s2.length > 2 || s2.length == 0)
    		return false;
    	
    	for (String num : s2)
    		if (isValidNum(num) == false)
    			return false;
    	
    	return true;
	}

	private boolean isValidNum(String str) {
		if (str.length() == 0)
			return false;

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) > '9' || str.charAt(i) < '0')
				return false;
		return true;
	}
}
