package LeetCode;

import java.util.ArrayList;

public class LetterCombinationsofaPhoneNumber {
	//Given a digit string, return all possible letter combinations that the number could represent.

	//A mapping of digit to letters (just like on the telephone buttons) is given below.



	//Input:Digit string "23"
	//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
	//Note:
	//Although the above answer is in lexicographical order, your answer could be in any order you want.
	
	private ArrayList<String> ret = null;
	final private String[] pad = new String[]{" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public ArrayList<String> letterCombinations(String digits) {
    	ret = new ArrayList<String>();
    	digitsToLetters("", digits, 0);
    	return ret;
    }
    
    private void digitsToLetters(String s, String digits, int idx)
    {
    	if (idx >= digits.length())
    	{
    		ret.add(s);
    		return;
    	}
    	
    	String p = pad[digits.charAt(idx) - '0'];
    	
    	for (int i = 0; i < p.length(); i++)
    		digitsToLetters(s + p.charAt(i), digits, idx + 1);
    }
}
