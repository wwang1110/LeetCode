/* Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * American keyboard
 * 
 * Example 1:
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet
 * 
 */

package lc.q0500.KeyboardRow;

import java.util.*;

public class Solution {
    public String[] findWords(String[] words) {
    	Map<Character, Integer> map=new HashMap<Character, Integer>();
    	map.put('q', 1);
    	map.put('w', 1);
    	map.put('e', 1);
    	map.put('r', 1);
    	map.put('t', 1);
    	map.put('y', 1);
    	map.put('u', 1);
    	map.put('i', 1);
    	map.put('o', 1);
    	map.put('p', 1);
    	map.put('a', 2);
    	map.put('s', 2);
    	map.put('d', 2);
    	map.put('f', 2);
    	map.put('g', 2);
    	map.put('h', 2);
    	map.put('j', 2);
    	map.put('k', 2);
    	map.put('l', 2);
    	map.put('z', 3);
    	map.put('x', 3);
    	map.put('c', 3);
    	map.put('v', 3);
    	map.put('b', 3);
    	map.put('n', 3);
    	map.put('m', 3);
    	List<String> res=new ArrayList<String>();
    	for(String word:words)
    	{
    		if(word.length()==0)
    			continue;
    		String nword=word.toLowerCase();
    		boolean oneRow=true;
    		for(int i=1;i<nword.length();i++)
    			if(map.get(nword.charAt(i))!=map.get(nword.charAt(i-1)))
    			{
    				oneRow=false;
    				break;
    			}
    		if(oneRow==true)
    			res.add(word);
    	}
    	String[] ret=new String[res.size()];
    	res.toArray(ret);
    	return ret;
    }
}
