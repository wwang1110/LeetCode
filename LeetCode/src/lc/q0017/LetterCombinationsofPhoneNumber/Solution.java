/*	Given a digit string, return all possible letter combinations that the number could represent.
 * 	A mapping of digit to letters (just like on the telephone buttons) is given below.
 * 	Input:Digit string "23"
 * 	Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 	Note:
 * 	Although the above answer is in lexicographical order, your answer could be in any order you want.
 */

package lc.q0017.LetterCombinationsofPhoneNumber;
import java.util.*;

public class Solution {
	void generateCombination(String comb, int index, List<String> res, String digits, Map<Character, String> dic)
	{
		if (index == digits.length())
		{
			res.add(comb);
			return;
		}
		
		if (!dic.containsKey(digits.charAt(index)))
		{
			generateCombination(comb + digits.charAt(index), index + 1, res, digits, dic);
		}
		else
		{
			String keymap = dic.get(digits.charAt(index));
			for (int i = 0; i < keymap.length(); i++)
				generateCombination(comb + keymap.charAt(i), index + 1, res, digits, dic);
		}
				
	}
	
    public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>();

        if (digits.length() == 0)
            return res;
        
    	Map<Character, String> dic = new HashMap<Character, String>();
    	dic.put('2', "abc");
    	dic.put('3', "def");
    	dic.put('4', "ghi");
    	dic.put('5', "jkl");
    	dic.put('6', "mno");
    	dic.put('7', "pqrs");
    	dic.put('8', "tuv");
    	dic.put('9', "wxyz");
		
    	generateCombination("", 0, res, digits, dic);
    	
    	return res;
    }
}
