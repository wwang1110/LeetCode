package LeetCode;

public class ImplementstrStr {
	//Implement strStr().

	//Returns a pointer to the first occurrence of needle in haystack, 
	//or null if needle is not part of haystack.
    public String strStr(String haystack, String needle) {
    	int len = haystack.length();
    	int l = needle.length();
    	for (int i = 0; i + l <= len; i++)
    	{
    		if (haystack.substring(i, i+l).equals(needle))
    			return haystack.substring(i);
    	}
    	return null;
    }	
}
