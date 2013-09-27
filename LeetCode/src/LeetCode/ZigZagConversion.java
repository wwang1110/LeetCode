package LeetCode;

public class ZigZagConversion {
	//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
	//(you may want to display this pattern in a fixed font for better legibility)

	//P   A   H   N
	//A P L S I I G
	//Y   I   R
	//And then read line by line: "PAHNAPLSIIGYIR"
	//Write the code that will take a string and make this conversion given a number of rows:

	//string convert(string text, int nRows);
	//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
	
    public String convert(String s, int nRows) {
    	if (nRows == 1)
    		return s;
    	StringBuilder sb = new StringBuilder();
    	int len = s.length();
    	int partition = 2 * nRows - 2; 
    	for (int i = 0; i < nRows; i++)
    		for (int j = 0; j < len; j++)
    		{
    			if (j % partition == i || j % partition == partition - i)
    				sb.append(s.charAt(j));
    		}
    	return sb.toString();
    }	
}
